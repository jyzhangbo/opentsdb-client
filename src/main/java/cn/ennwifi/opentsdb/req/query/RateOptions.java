package cn.ennwifi.opentsdb.req.query;

/**
 * @author zhangbo
 *
 */
public class RateOptions {

  public boolean counter = false;
  public Integer counterMax = (int) Long.MAX_VALUE;
  public Integer resetValue = 0;
  public boolean dropResets = false;

  /**
   * @return the counter
   */
  public boolean isCounter() {
    return counter;
  }

  /**
   * @param counter the counter to set
   */
  public void setCounter(boolean counter) {
    this.counter = counter;
  }

  /**
   * @return the counterMax
   */
  public Integer getCounterMax() {
    return counterMax;
  }

  /**
   * @param counterMax the counterMax to set
   */
  public void setCounterMax(Integer counterMax) {
    this.counterMax = counterMax;
  }

  /**
   * @return the resetValue
   */
  public Integer getResetValue() {
    return resetValue;
  }

  /**
   * @param resetValue the resetValue to set
   */
  public void setResetValue(Integer resetValue) {
    this.resetValue = resetValue;
  }

  /**
   * @return the dropResets
   */
  public boolean isDropResets() {
    return dropResets;
  }

  /**
   * @param dropResets the dropResets to set
   */
  public void setDropResets(boolean dropResets) {
    this.dropResets = dropResets;
  }

  @Override
  public String toString() {
    return "RateOptions [counter=" + counter + ", counterMax=" + counterMax + ", resetValue=" + resetValue
        + ", dropResets=" + dropResets + "]";
  }

}
