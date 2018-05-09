import {Counts} from "./counts";
import {DecreeChart} from "./decree-chart";

export class Decree{
    id: number;
    createDate: string;
    status: string;
    finalizedDate: string;
    numberOfItems: number;
    processingTime: string;
    counts: Counts;
    decreeChart: DecreeChart;
}