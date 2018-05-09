import {NgModule} from '@angular/core';
import {CommonModule,} from '@angular/common';
import {BrowserModule} from '@angular/platform-browser';
import {Routes, RouterModule} from '@angular/router';

import {HomeComponent} from './home/home.component';
import {DecreeComponent} from './decree/decree.component';
import {GenerationComponent} from './generation/generation.component';
import {UserComponent} from './user/user.component';
import {TablesComponent} from './tables/tables.component';
import {TypographyComponent} from './typography/typography.component';
import {IconsComponent} from './icons/icons.component';
import {MapsComponent} from './maps/maps.component';
import {NotificationsComponent} from './notifications/notifications.component';
import {UpgradeComponent} from './upgrade/upgrade.component';
import {HttpClientModule} from "@angular/common/http";

const routes: Routes = [
    {path: 'decree', component: DecreeComponent},
    {path: 'generation', component: GenerationComponent},
    {path: '', redirectTo: 'decree', pathMatch: 'full'}
];

@NgModule({
    imports: [
        CommonModule,
        BrowserModule,
        RouterModule.forRoot(routes),
        HttpClientModule,
    ],
    exports: [],
})
export class AppRoutingModule {
}
