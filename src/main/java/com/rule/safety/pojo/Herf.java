package com.rule.safety.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="herf")
public class Herf {
	
	public Herf() {
		
	}
	
	public Herf(String report, String evidence, String discoveryDate, String discoveryTime, String reportDesc, String reportLocation, String categories, String categoryDesc, int patientNumber, String patientName, String patientDob, int medRecordNo, String patientGender,  String nPatientName, String nPatientDob, int nMedRecordNo, String nPatientGender, String reportDate, String anonymousReporter, String reporterName, String reporterPhone, String reporterUsername, String reporterJob){
		this.report = report;
		this.evidence = evidence;
		this.discoveryDate = discoveryDate;
		this.discoveryTime = discoveryTime;
		this.reportDesc = reportDesc;
		this.reportLocation = reportLocation;
		this.category = categories;
		this.categoryDesc = categoryDesc;
		this.patients = patientNumber;
		this.patientName = patientName;
		this.patientDob = patientDob;
		this.medRecordNo = medRecordNo;
		this.patientGender = patientGender;
		this.nPatientName = nPatientName;
		this.nPatientDob = nPatientDob;
		this.nMedRecordNo = nMedRecordNo;
		this.nPatientGender = nPatientGender;
		this.reportDate =  reportDate;
		this.anonymousReporter = anonymousReporter;
		this.reporterName = reporterName;
		this.reporterUsername = reporterUsername;
		this.telephoneNumber = reporterPhone;
		this.reporterJob = reporterJob;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reportid", unique=true, nullable=false)
	private Integer reportID;
	
	@Column(name="report", unique=true, nullable=false, length=10)
	private String report;
	
	@Column(name="evidence", unique=true, length=10)
	private String evidence;
	
	@Column(name="discoverydate", unique=true, length=12)
	private String discoveryDate;
	
	@Column(name="discoverytime", unique=true, length=12)
	private String discoveryTime;
	
	@Column(name="reportdesc", unique=true, nullable=false, length=140)
	private String reportDesc;
	
	@Column(name="reportlocation", unique=true, nullable=false, length=45)
	private String reportLocation;

	@Column(name="category", unique=true, nullable=false, length=140)
	private String category;
	
	@Column(name="categorydesc", unique=true, length=25)
	private String categoryDesc;
	
	@Column(name="patients", unique=true)
	private Integer patients;
	
	@Column(name="patientname", unique=true, length=45)
	private String patientName;
	
	@Column(name="patientdob", unique=true, length=12)
	private String patientDob;
	
	@Column(name="medrecordno", unique=true)
	private Integer medRecordNo;

	@Column(name="patientgender", unique=true, length=45)
	private String patientGender;
	
	@Column(name="npatientname", unique=true, length=45)
	private String nPatientName;

	@Column(name="npatientdob", unique=true, length=12)
	private String nPatientDob;
	
	@Column(name="nmedrecordno", unique=true)
	private Integer nMedRecordNo;

	@Column(name="npatientgender", unique=true, length=45)
	private String nPatientGender;
	
	@Column(name="reportdate", unique=true, nullable=false, length=12)
	private String reportDate;

	@Column(name="anonymousreporter", unique=true, nullable=false, length=45)
	private String anonymousReporter;
	
	@Column(name="reportername", unique=true, nullable=false, length=45)
	private String reporterName;

	@Column(name="telephonenumber", unique=true, nullable=false, length=45)
	private String telephoneNumber;
	
	@Column(name="reporterusername", unique=true, nullable=false, length=45)
	private String reporterUsername;

	@Column(name="reporterjob", unique=true, nullable=false, length=45)
	private String reporterJob;
	
	@Column(name="status", unique=true, length=25)
	private String status;
	
	@Column(name="comment", unique=true, length=140)
	private String comment;

	@Column(name="actiontaken", unique=true, length=140)
	private String actionTaken;
	
	@Column(name="complainton", unique=true, length=25)
	private String complaintOn;
	
	@Column(name="forwarded", unique=true, length=6)
	private String forwarded;

	@Column(name="task", unique=true, length=140)
	private String task;
	
	public Integer getReportID() {
		return reportID;
	}

	public void setReportID(Integer reportID) {
		this.reportID = reportID;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getEvidence() {
		return evidence;
	}

	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}

	public String getDiscoveryDate() {
		return discoveryDate;
	}

	public void setDiscoveryDate(String discoveryDate) {
		this.discoveryDate = discoveryDate;
	}

	public String getDiscoveryTime() {
		return discoveryTime;
	}

	public void setDiscoveryTime(String discoveryTime) {
		this.discoveryTime = discoveryTime;
	}

	public String getReportDesc() {
		return reportDesc;
	}

	public void setReportDesc(String reportDesc) {
		this.reportDesc = reportDesc;
	}

	public String getReportLocation() {
		return reportLocation;
	}

	public void setReportLocation(String reportLocation) {
		this.reportLocation = reportLocation;
	}

	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public Integer getPatients() {
		return patients;
	}

	public void setPatients(Integer patients) {
		this.patients = patients;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientDob() {
		return patientDob;
	}

	public void setPatientDob(String patientDob) {
		this.patientDob = patientDob;
	}

	public Integer getMedRecordNo() {
		return medRecordNo;
	}

	public void setMedRecordNo(Integer medRecordNo) {
		this.medRecordNo = medRecordNo;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getnPatientName() {
		return nPatientName;
	}

	public void setnPatientName(String nPatientName) {
		this.nPatientName = nPatientName;
	}

	public String getnPatientDob() {
		return nPatientDob;
	}

	public void setnPatientDob(String nPatientDob) {
		this.nPatientDob = nPatientDob;
	}

	public Integer getnMedRecordNo() {
		return nMedRecordNo;
	}

	public void setnMedRecordNo(Integer nMedRecordNo) {
		this.nMedRecordNo = nMedRecordNo;
	}


	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getnPatientGender() {
		return nPatientGender;
	}

	public void setnPatientGender(String nPatientGender) {
		this.nPatientGender = nPatientGender;
	}

	public String getAnonymousReporter() {
		return anonymousReporter;
	}

	public void setAnonymousReporter(String anonymousReporter) {
		this.anonymousReporter = anonymousReporter;
	}

	public String getReporterName() {
		return reporterName;
	}

	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getReporterUsername() {
		return reporterUsername;
	}

	public void setReporterUsername(String reporterUsername) {
		this.reporterUsername = reporterUsername;
	}

	public String getReporterJob() {
		return reporterJob;
	}

	public void setReporterJob(String reporterJob) {
		this.reporterJob = reporterJob;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getActionTaken() {
		return actionTaken;
	}

	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}
	
	public String getComplaintOn() {
		return complaintOn;
	}

	public void setComplaintOn(String complaintOn) {
		this.complaintOn = complaintOn;
	}

	public String getForwarded() {
		return forwarded;
	}

	public void setForwarded(String forwarded) {
		this.forwarded = forwarded;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
