package casestudy.question1;

public class CostEstimation extends ConstructionMaterial{
    public CostEstimation(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void receiveMaterial() {

    }

    @Override
    public void useMaterial() {

    }

    @Override
    public void estimateCost() {
        double cost = 0;
        double quantity = getMaterialQuantity();

        if (quantity >= 5 && quantity <= 15){
            cost = 200_000;
        }else if (quantity > 15){
            cost = 180_000;
        }else{
            System.out.println("Can not estimate cost for quantity less than 5 tons.");
        }

        double totalCost = quantity * cost;

        System.out.println("=== Cost Estimation ===");
        System.out.println("Contractor ID: "+getContractorId());
        System.out.println("Contractor Name: "+getContractorName());
        System.out.println("Quantity used: "+ quantity);
        System.out.printf("Total cost: %, .2f RWF%n", totalCost);
    }
}
