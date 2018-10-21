package br.com.starpeace.model;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cap")
public class CapEntity implements Serializable {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;
  private String category;
  private String event;
  private String description;
  private String urgency;
  private String severity;
  private String certainty;
  private String local;
  private Date effective = new Date();

  public Date getEffective() {
    return effective;
  }

  public void setEffective(final Date effective) {
    this.effective = effective;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(final String category) {
    this.category = category;
  }

  public String getEvent() {
    return event;
  }

  public void setEvent(final String event) {
    this.event = event;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public String getUrgency() {
    return urgency;
  }

  public void setUrgency(final String urgency) {
    this.urgency = urgency;
  }

  public String getSeverity() {
    return severity;
  }

  public void setSeverity(final String severity) {
    this.severity = severity;
  }

  public String getCertainty() {
    return certainty;
  }

  public void setCertainty(final String certainty) {
    this.certainty = certainty;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(final String local) {
    this.local = local;
  }

  @Override
  public String toString() {
    return "CapEntity{" +
            "id=" + id +
            ", category='" + category + '\'' +
            ", event='" + event + '\'' +
            ", description='" + description + '\'' +
            ", urgency='" + urgency + '\'' +
            ", severity='" + severity + '\'' +
            ", certainty='" + certainty + '\'' +
            ", local='" + local + '\'' +
            '}';
  }
}
