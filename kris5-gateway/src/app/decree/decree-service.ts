import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import {Decree} from "./decree";
import 'rxjs/add/operator/map'

@Injectable()
export class DecreeService {

    private dataUrl ='/application-service/decree';

    constructor(private http: Http) {

    }


    query(): Observable<Decree[]> {
        return this.http.get(this.dataUrl).map((res:Response) => this.convertResponse(res));

    }

    public create(numberToGenerate:number) {
        return this.http.post(this.dataUrl, {numberToGenerate: numberToGenerate});
    }

    private convertResponse(res: Response): Decree[] {
        const jsonResponse = res.json();
        const result = [];
        for (let i = 0; i < jsonResponse.length; i++) {
            result.push(this.convertItemFromServer(jsonResponse[i]));
        }
        return result;
    }
    private convertItemFromServer(json: any): Decree {
        const entity: Decree = Object.assign(new Decree(), json);
        return entity;
    }
}