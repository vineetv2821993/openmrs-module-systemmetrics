/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.systemmetrics;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "systemmetrics_metric_type")
public class MetricType implements Serializable {

    @Id
    @Column(name = "metric_id")
    private int metricId;

    @Column(name = "metric_name", length = 255)
    private String metricName;

    @Column(name = "metric_type", length = 255)
    private String metricType;

    public MetricType(int metric_id, String metric_name, String metric_type) {
        this.metricId = metric_id;
        this.metricName= metric_name;
        this.metricType=metric_type;
    }

    public int getMetricId() {
        return metricId;
    }

    public void setMetricId(int metric_id) {
        this.metricId = metric_id;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metric_name) {
        this.metricName = metric_name;
    }

    public String getMetric_type() {
        return metricType;
    }

    public void setMetric_type(String metric_type) {
        this.metricType = metric_type;
    }
}
