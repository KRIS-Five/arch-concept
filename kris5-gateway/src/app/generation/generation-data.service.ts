import {Injectable} from '@angular/core';
import {GeneratedData} from './generated-data'
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {GenerateDataRequest} from "./data-generation-request";

@Injectable()
export class GenerationService {

    constructor(private http: HttpClient) {
    }

    dataUrl = '/application-service/generated-data-amount';
    personGenerateUrl = '/application-service/generate-persons';
    regPartGenerateUrl = '/application-service/generate-reg-parts';

    headers = new HttpHeaders({
        'Content-Type': 'application/json'
    });

    public me() {
        return this.http.get<GeneratedData>(this.dataUrl);
    }

    public postPersonGeneration(numberToGenerate) {
        return this.http.post(this.personGenerateUrl,{numberToGenerate: numberToGenerate},{headers: this.headers})
    }

    public postRegPartGeneration(numberToGenerate) {
        return this.http.post(this.regPartGenerateUrl,{numberToGenerate: numberToGenerate},{headers: this.headers})
    }
}

