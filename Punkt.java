public class Punkt
	{
		double x, y, z;
		
		public Punkt(double x, double y, double z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		static int symbolNewtona(int n, int k)
	    {
	        if (k == 0 || k == n)
	            return 1;
	        else
	            return symbolNewtona(n-1, k-1) + symbolNewtona(n-1, k);
	    }

	    static Double berstein(int m, int i, double v){
	        return symbolNewtona(m,i) * Math.pow(v,i) * Math.pow(1-v,m-i);
	    }
	    
		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public double getZ() {
			return z;
		}

		public void setZ(double z) {
			this.z = z;
		}
		
		@Override
	    public String toString(){
	        return "Koordynaty punktów: ["+x+","+y+","+z+"]";
	    }
	}
