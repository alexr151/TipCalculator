package model;

public class TipCalculator {
	
	private double total, tipTotal;
	private final double TIP = 0.20;
	
	
	public TipCalculator() {
		super();
	}
	
	public TipCalculator(double total) {
		super();
		this.total = total;
		
	}

	public void setTipTotal(double total) {
		
		this.tipTotal = this.total * this.TIP;
	}
	
	public double getTipTotal() {
		return this.tipTotal;
	}

	public String outputTip() {
		
		return "Total Sales: $" + this.total + "\nTotal in Tips: $" + getTipTotal() + "\nTotal: $" + (this.total + getTipTotal());
	}
	

}
