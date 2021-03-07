package entities;

public class Company extends Payer {

	private Integer numberEmployee;

	public Company(String name, Double anualIncome, Integer numberEmployee) {
		super(name, anualIncome);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public double tax() {
		Double sum = 0.0;
		if (numberEmployee > 10) {
			sum += super.getAnualIncome() * 0.14;
		} else {
			sum += super.getAnualIncome() * 0.16;
		}
		return sum;
	}

}
