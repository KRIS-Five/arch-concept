import { Component, OnInit } from '@angular/core';
import { LocationStrategy, PlatformLocation, Location } from '@angular/common';
import { LegendItem, ChartType } from '../lbd/lbd-chart/lbd-chart.component';
import * as Chartist from 'chartist';
import {Http} from "@angular/http";
import {Decree} from "./decree";
import {DecreeService} from "./decree-service";
import {DecreeChart} from "./decree-chart";

@Component({
  selector: 'app-decree',
  templateUrl: './decree.component.html',
  styleUrls: ['./decree.component.css'],
    providers: [DecreeService]
})
export class DecreeComponent implements OnInit {

    public emailChartType: ChartType;
    public emailChartData: any;
    public emailChartLegendItems: LegendItem[];

    public hoursChartType: ChartType;
    public hoursChartData: any;
    public hoursChartOptions: any;
    public hoursChartResponsive: any[];
    public hoursChartLegendItems: LegendItem[];

    public activityChartType: ChartType;
    public activityChartData: any;
    public activityChartOptions: any;
    public activityChartResponsive: any[];
    public activityChartLegendItems: LegendItem[];

    public decrees: Decree[];

  constructor(private decreeService: DecreeService) { }

  ngOnInit() {

      this.decreeService.query().subscribe(
          (res: Decree[]) => this.fetchedDecrees(res),
      );

      this.emailChartType = ChartType.Pie;
      this.emailChartData = {
        labels: ['62%', '32%', '6%'],
        series: [62, 32, 6]
      };
      this.emailChartLegendItems = [
        { title: 'Open', imageClass: 'fa fa-circle text-info' },
        { title: 'Bounce', imageClass: 'fa fa-circle text-danger' },
        { title: 'Unsubscribe', imageClass: 'fa fa-circle text-warning' }
      ];

      this.hoursChartType = ChartType.Line;
      this.hoursChartData = {
        labels: ['9:00AM', '12:00AM', '3:00PM', '6:00PM', '9:00PM', '12:00PM', '3:00AM', '6:00AM'],
        series: [
          [287, 385, 490, 492, 554, 586, 698, 695, 752, 788, 846, 944],
          [67, 152, 143, 240, 287, 335, 435, 437, 539, 542, 544, 647],
          [23, 113, 67, 108, 190, 239, 307, 308, 439, 410, 410, 509]
        ]
      };
      this.hoursChartOptions = {
        low: 0,
        high: 800,
        showArea: true,
        height: '245px',
        axisX: {
          showGrid: false,
        },
        lineSmooth: Chartist.Interpolation.simple({
          divisor: 3
        }),
        showLine: false,
        showPoint: false,
      };
      this.hoursChartResponsive = [
        ['screen and (max-width: 640px)', {
          axisX: {
            labelInterpolationFnc: function (value) {
              return value[0];
            }
          }
        }]
      ];
      this.hoursChartLegendItems = [
        { title: 'Open', imageClass: 'fa fa-circle text-info' },
        { title: 'Click', imageClass: 'fa fa-circle text-danger' },
        { title: 'Click Second Time', imageClass: 'fa fa-circle text-warning' }
      ];

      this.activityChartType = ChartType.Bar;
      this.activityChartData = {
        labels: ['Jan', 'Feb', 'Mar', 'Apr', 'Mai', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'],
        series: [
          [542, 443, 320, 780, 553, 453, 326, 434, 568, 610, 756, 895],
          [412, 243, 280, 580, 453, 353, 300, 364, 368, 410, 636, 695]
        ]
      };
      this.activityChartOptions = {
        seriesBarDistance: 10,
        axisX: {
          showGrid: false
        },
        height: '245px'
      };
      this.activityChartResponsive = [
        ['screen and (max-width: 640px)', {
          seriesBarDistance: 5,
          axisX: {
            labelInterpolationFnc: function (value) {
              return value[0];
            }
          }
        }]
      ];
      this.activityChartLegendItems = [
        { title: 'Tesla Model S', imageClass: 'fa fa-circle text-info' },
        { title: 'BMW 5 Series', imageClass: 'fa fa-circle text-danger' }
      ];


    }

    private fetchedDecrees(res: Decree[]) {
        this.decrees = []
        for (let i = 0; i < res.length; i++) {
            let decree = res[i];
            let decreeChart = new DecreeChart();
            decreeChart.chartType = ChartType.Pie;
            decreeChart.chartData = {
                labels: [decree.counts.activeItems, decree.counts.failedItems, decree.counts.readyToProcessItems],
                series: [decree.counts.activeItems, decree.counts.failedItems, decree.counts.readyToProcessItems]
            };
            decreeChart.chartLegendItems = [
                { title: 'Processed', imageClass: 'fa fa-circle text-info' },
                { title: 'Failed', imageClass: 'fa fa-circle text-danger' },
                { title: 'Ready to process', imageClass: 'fa fa-circle text-warning' }
            ];
            console.log(res[i].counts);
            decree.decreeChart = decreeChart;
            console.log(JSON.stringify(decreeChart));
            this.decrees.push(decree);
        }
    }

    createDecree() {
        var numberToGenerate = ((document.getElementById("number_items_to_generate") as HTMLInputElement).value);
        this.decreeService.create(parseInt(numberToGenerate)) .subscribe(data => {
            window.location.reload();
            }, error => {
            console.log(JSON.stringify(error.json()));
        });
    }

}
