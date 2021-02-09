class Fraction{
    
    //instance start
    public int N;
    public int D;
    
    public int newN;
    public int newD;
    //instance end
    
    //constructor start
    
    public Fraction(){
       this.N = 1;
       this.D = 2;
    }
    
    public Fraction(int N, int D){
        this.N = N;
        if(D==0) {
            System.out.println("Error: denominator invalid");
            this.D = 1;
        }else{
            this.D = D;
        }
    }
    
    public Fraction(String frac){
        this.N = Integer.parseInt(frac.substring(0,frac.indexOf("/")));
        this.D = Integer.parseInt(frac.substring(frac.indexOf("/")+1,frac.length()));
        if(this.D==0) {
            System.out.println("Error: denominator invalid");
            this.D = 1;
        }
    }
    
    public Fraction(Fraction f){
        this.N = f.N;
        this.D = f.D;
    }
    
    //constructors end
    //accessor start
    
    public int getNum(){
        return this.N;
    }
    public int getDenom(){
        return this.D;
    }
    
    public String toString(){
        return this.N+"//"+this.D;
    }
    
    public double toDouble(){
        return ((double)this.N)/((double)this.D);
    }
    
    //accessor end
    // mutators begin
    
    public void reduce(){
        for(int i=2;i<=this.N&&i<=this.D;i++){
            if(this.N%i==0&&this.D%i==0){
                this.N=this.N/i;
                this.D=this.D/i;
                i=1;
            }
        }
    }
    
    public void setNum(int n){
        this.N=n;
    }
    
    public void setDenom(int d){
        if(d==0) {
            System.out.println("Error: denominator invalid");
            this.D = 1;
        }else{
            this.D = d;
        }
    }
    
    //mutators end
    //static method start
    
    public static Fraction multiply(Fraction a,Fraction b){
        int newNum=a.N*b.N;
        int newDen=a.D*b.D;
        Fraction f = new Fraction (newNum, newDen);
        f.reduce();
        return f;
    }
    
    public static Fraction divide(Fraction a,Fraction b){
        if(b.N==0) {
            System.out.println("Error: denominator invalid");
            b.N = 1;
        }
        int newNum=a.N*b.D;
        int newDen=a.D*b.N;
        Fraction f = new Fraction (newNum, newDen);
        f.reduce();
        return f;
    }
    
    public static Fraction add(Fraction a,Fraction b){
        int newNum=a.N*b.D+b.N*a.D;
        int newDen=a.D*b.D;
        Fraction f = new Fraction (newNum, newDen);
        f.reduce();
        return f;
    }
    
    public static Fraction subtract(Fraction a,Fraction b){
        int newNum=a.N*b.D-b.N*a.D;
        int newDen=a.D*b.D;
        Fraction f = new Fraction (newNum, newDen);
        f.reduce();
        return f;
    }
    //static method end
    //helper methods begin
    
    //private GCF(int n,int d){
        
    //}
    
    //helper methods end
}