export class GeneratedData {
    numberOfRegistryParts: number;
    numberOfPersons: number;

    static fromJSON(json) {
        const data: GeneratedData = new GeneratedData();
        data.numberOfPersons = json.numberOfPersons;
        data.numberOfRegistryParts = json.numberOfRegistryParts;
        return data;
    }
}