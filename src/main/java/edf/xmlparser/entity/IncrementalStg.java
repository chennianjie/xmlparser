package edf.xmlparser.entity;

import java.io.Serializable;
import java.sql.Date;


public class IncrementalStg implements Serializable {

    private static final long serialVersionUID = -6555632273871004477L;

    private long id;
    private String version = null;
    private long property_id;
    private String current_value;
    private String classifier_type;
    private String valid_from;
    private String valid_from_inc_time;
    private String valid_to;
    private String valid_to_inc_time;
    private String language = null;
    private String bpm_batch_guid;
    private int bpm_batch_index;
    private Date create_date = new Date(System.currentTimeMillis());
    private String create_by = "PDP";
    private String fileName;

    /**
     * 1--invalid   0--valid  default(0)
     */
    private Integer isInvalid = 0;

    public Integer getIsInvalid() {
        return isInvalid;
    }

    public void setIsInvalid(Integer isInvalid) {
        this.isInvalid = isInvalid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public long getProperty_id() {
        return property_id;
    }

    public void setProperty_id(long property_id) {
        this.property_id = property_id;
    }

    public String getCurrent_value() {
        return current_value;
    }

    public void setCurrent_value(String current_value) {
        this.current_value = current_value;
    }

    public String getClassifier_type() {
        return classifier_type;
    }

    public void setClassifier_type(String classifier_type) {
        this.classifier_type = classifier_type;
    }

    public String getValid_from() {
        return valid_from;
    }

    public void setValid_from(String valid_from) {
        this.valid_from = valid_from;
    }

    public String getValid_from_inc_time() {
        return valid_from_inc_time;
    }

    public void setValid_from_inc_time(String valid_from_inc_time) {
        this.valid_from_inc_time = valid_from_inc_time;
    }

    public String getValid_to() {
        return valid_to;
    }

    public void setValid_to(String valid_to) {
        this.valid_to = valid_to;
    }

    public String getValid_to_inc_time() {
        return valid_to_inc_time;
    }

    public void setValid_to_inc_time(String valid_to_inc_time) {
        this.valid_to_inc_time = valid_to_inc_time;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBpm_batch_guid() {
        return bpm_batch_guid;
    }

    public void setBpm_batch_guid(String bpm_batch_guid) {
        this.bpm_batch_guid = bpm_batch_guid;
    }

    public int getBpm_batch_index() {
        return bpm_batch_index;
    }

    public void setBpm_batch_index(int bpm_batch_index) {
        this.bpm_batch_index = bpm_batch_index;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "IncrementalStg{" +
                "id=" + id +
                ", version='" + version + '\'' +
                ", property_id=" + property_id +
                ", current_value='" + current_value + '\'' +
                ", classifier_type='" + classifier_type + '\'' +
                ", valid_from='" + valid_from + '\'' +
                ", valid_from_inc_time='" + valid_from_inc_time + '\'' +
                ", valid_to='" + valid_to + '\'' +
                ", valid_to_inc_time='" + valid_to_inc_time + '\'' +
                ", language='" + language + '\'' +
                ", bpm_batch_guid='" + bpm_batch_guid + '\'' +
                ", bpm_batch_index=" + bpm_batch_index +
                ", create_date=" + create_date +
                ", create_by='" + create_by + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
