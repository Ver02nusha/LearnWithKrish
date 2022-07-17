
abstract class Animal implements Cloneable{
	
	protected String name;
    abstract void addAnimal();
      
    public Object clone()
    {
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
