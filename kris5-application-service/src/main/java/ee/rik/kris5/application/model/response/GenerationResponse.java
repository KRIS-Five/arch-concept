package ee.rik.kris5.application.model.response;

public class GenerationResponse {

    private boolean success;
    private Integer generatedAmount;

    public GenerationResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getGeneratedAmount() {
        return generatedAmount;
    }

    public void setGeneratedAmount(Integer generatedAmount) {
        this.generatedAmount = generatedAmount;
    }
}
