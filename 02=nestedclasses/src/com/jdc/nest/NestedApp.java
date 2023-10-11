package com.jdc.nest;


public class NestedApp {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.setOutData(10);
		
		Outer.InnerStatic innerStat = new Outer.InnerStatic();
		innerStat.setInnerStatData(20);
		System.out.println(innerStat.getInnerStatData());
		
		Outer.InnerInstance innerInst = outer.new InnerInstance();
		innerInst.setInnerInstanceData(30);
		System.out.println(innerInst.getInnerInstanceData());
		
		Outer.InnerInstance.MoreInner moreInner = new Outer().new InnerInstance().new MoreInner();
	}

}
