package entities;

public class Individual extends Payer {

	private Double healthExpenditure;

	public Individual(String name, Double anualIncome, Double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public double tax() {
		double sum = 0.0;
		if(super.getAnualIncome() < 20_000) {
			sum += (super.getAnualIncome() * 0.15) - (healthExpenditure * 0.5);
		}else {
			sum += (super.getAnualIncome() * 0.25) - (healthExpenditure * 0.5);
		}
		return sum;
	}

}
