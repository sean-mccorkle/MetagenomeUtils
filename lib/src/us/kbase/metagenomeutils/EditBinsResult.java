
package us.kbase.metagenomeutils;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: EditBinsResult</p>
 * <pre>
 * new_binned_contig_ref: newly created BinnedContig object referece
 * report_name: report name generated by KBaseReport
 * report_ref: report reference generated by KBaseReport
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "new_binned_contig_ref",
    "report_name",
    "report_ref"
})
public class EditBinsResult {

    @JsonProperty("new_binned_contig_ref")
    private String newBinnedContigRef;
    @JsonProperty("report_name")
    private String reportName;
    @JsonProperty("report_ref")
    private String reportRef;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("new_binned_contig_ref")
    public String getNewBinnedContigRef() {
        return newBinnedContigRef;
    }

    @JsonProperty("new_binned_contig_ref")
    public void setNewBinnedContigRef(String newBinnedContigRef) {
        this.newBinnedContigRef = newBinnedContigRef;
    }

    public EditBinsResult withNewBinnedContigRef(String newBinnedContigRef) {
        this.newBinnedContigRef = newBinnedContigRef;
        return this;
    }

    @JsonProperty("report_name")
    public String getReportName() {
        return reportName;
    }

    @JsonProperty("report_name")
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public EditBinsResult withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    @JsonProperty("report_ref")
    public String getReportRef() {
        return reportRef;
    }

    @JsonProperty("report_ref")
    public void setReportRef(String reportRef) {
        this.reportRef = reportRef;
    }

    public EditBinsResult withReportRef(String reportRef) {
        this.reportRef = reportRef;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("EditBinsResult"+" [newBinnedContigRef=")+ newBinnedContigRef)+", reportName=")+ reportName)+", reportRef=")+ reportRef)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
