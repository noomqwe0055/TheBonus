
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int n){

		System.out.println("��⺹�������ҡ���  "+n+" �� "+(bonusCalculator.computeBonus(n)));
	}
}
