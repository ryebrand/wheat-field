package pers.jun.pojo;

public class Sequence {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence_info.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence_info.current_value
     *
     * @mbg.generated
     */
    private Integer currentValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence_info.step
     *
     * @mbg.generated
     */
    private Integer step;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sequence_info.name
     *
     * @return the value of sequence_info.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sequence_info.name
     *
     * @param name the value for sequence_info.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sequence_info.current_value
     *
     * @return the value of sequence_info.current_value
     *
     * @mbg.generated
     */
    public Integer getCurrentValue() {
        return currentValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sequence_info.current_value
     *
     * @param currentValue the value for sequence_info.current_value
     *
     * @mbg.generated
     */
    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sequence_info.step
     *
     * @return the value of sequence_info.step
     *
     * @mbg.generated
     */
    public Integer getStep() {
        return step;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sequence_info.step
     *
     * @param step the value for sequence_info.step
     *
     * @mbg.generated
     */
    public void setStep(Integer step) {
        this.step = step;
    }
}