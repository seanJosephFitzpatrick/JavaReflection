package ie.gmit.sw;

public class Stability {

	private int inDegree;//Afferent Coupling
	private int outDegree;//Efferent Coupling
	private String className;
	
	/**
	 * getClassName Return class name
	 * @return Return class name
	 */
    public String getClassName() {
        return className;
    }

    /**
     * setClassName Set the class name
     * @param className Set className
     */
    public void setClassName(String className) {

        this.className = className;
    }

    /**
     * getInDegree Get the InDegree/Afferent Coupling
     * @return Return InDegree
     */
    public int getInDegree() {

        return inDegree;
    }

    /**
     * setInDegree Set the InDegree/Afferent Coupling
     * @param inDegree Set inDegree
     */
    public void setInDegree(int inDegree) {

        this.inDegree = inDegree;
    }

    /**
     * outDegree Get the outDegree/Efferent Coupling
     * @return Return OutDegree
     */
    public int getOutDegree() {

        return outDegree;
    }

    /**
     * setOutDegree Set the OutDegree/Efferent Coupling
     * @param outDegree Set outDegree
     */
    public void setOutDegree(int outDegree) {

        this.outDegree = outDegree;
    }

    /**
     * getStability Get the Stability Metric
     * @return Return class stability
     */
	public float getStability(){
		float stability = 1f;
		
		if(getOutDegree() > 0)
		{
			stability = ((float)getOutDegree() /( (float)getInDegree() + (float)getOutDegree()));
		}
		else{
			stability = 0f;
		}
		return (float) (Math.round(stability * 100d)/100d);
	}	
}