package com.jdc.nest;

public class Outer {
	
	private int outData;

	public int getOutData() {
		return outData;
	}

	public void setOutData(int outData) {
		this.outData = outData;
	}
	
	public class InnerInstance {
		private int innerInstanceData;
		
		public InnerInstance() {
			System.out.println(outData);
		}

		public int getInnerInstanceData() {
			return innerInstanceData;
		}

		public void setInnerInstanceData(int innerInstanceData) {
			this.innerInstanceData = innerInstanceData;
		}
		
		public class MoreInner{
			
		}
		
	}
	
	public static class InnerStatic{
		
		
		private int innerStatData;

		public int getInnerStatData() {
			return innerStatData;
		}

		public void setInnerStatData(int innerStatData) {
			this.innerStatData = innerStatData;
		}
		
	}

}
