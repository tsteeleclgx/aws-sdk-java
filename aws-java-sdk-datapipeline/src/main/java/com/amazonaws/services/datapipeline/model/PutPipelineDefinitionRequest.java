/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#putPipelineDefinition(PutPipelineDefinitionRequest) PutPipelineDefinition operation}.
 * <p>
 * Adds tasks, schedules, and preconditions to the specified pipeline.
 * You can use <code>PutPipelineDefinition</code> to populate a new
 * pipeline.
 * </p>
 * <p>
 * <code>PutPipelineDefinition</code> also validates the configuration
 * as it adds it to the pipeline. Changes to the pipeline are saved
 * unless one of the following three validation errors exists in the
 * pipeline.
 * </p>
 * <ol> <li>An object is missing a name or identifier field.</li>
 * <li>A string or reference field is empty.</li>
 * <li>The number of objects in the pipeline exceeds the maximum allowed
 * objects.</li>
 * <li>The pipeline is in a FINISHED state.</li>
 * </ol> <p>
 * Pipeline object definitions are passed to the
 * <code>PutPipelineDefinition</code> action and returned by the
 * GetPipelineDefinition action.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#putPipelineDefinition(PutPipelineDefinitionRequest)
 */
public class PutPipelineDefinitionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * The objects that define the pipeline. These objects overwrite the
     * existing pipeline definition.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjects;

    /**
     * The parameter objects used with the pipeline.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject> parameterObjects;

    /**
     * The parameter values used with the pipeline.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValues;

    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the pipeline.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The ID of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The ID of the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The ID of the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutPipelineDefinitionRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * The objects that define the pipeline. These objects overwrite the
     * existing pipeline definition.
     *
     * @return The objects that define the pipeline. These objects overwrite the
     *         existing pipeline definition.
     */
    public java.util.List<PipelineObject> getPipelineObjects() {
        if (pipelineObjects == null) {
              pipelineObjects = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>();
              pipelineObjects.setAutoConstruct(true);
        }
        return pipelineObjects;
    }
    
    /**
     * The objects that define the pipeline. These objects overwrite the
     * existing pipeline definition.
     *
     * @param pipelineObjects The objects that define the pipeline. These objects overwrite the
     *         existing pipeline definition.
     */
    public void setPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        if (pipelineObjects == null) {
            this.pipelineObjects = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>(pipelineObjects.size());
        pipelineObjectsCopy.addAll(pipelineObjects);
        this.pipelineObjects = pipelineObjectsCopy;
    }
    
    /**
     * The objects that define the pipeline. These objects overwrite the
     * existing pipeline definition.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPipelineObjects(java.util.Collection)} or {@link
     * #withPipelineObjects(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineObjects The objects that define the pipeline. These objects overwrite the
     *         existing pipeline definition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutPipelineDefinitionRequest withPipelineObjects(PipelineObject... pipelineObjects) {
        if (getPipelineObjects() == null) setPipelineObjects(new java.util.ArrayList<PipelineObject>(pipelineObjects.length));
        for (PipelineObject value : pipelineObjects) {
            getPipelineObjects().add(value);
        }
        return this;
    }
    
    /**
     * The objects that define the pipeline. These objects overwrite the
     * existing pipeline definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pipelineObjects The objects that define the pipeline. These objects overwrite the
     *         existing pipeline definition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutPipelineDefinitionRequest withPipelineObjects(java.util.Collection<PipelineObject> pipelineObjects) {
        if (pipelineObjects == null) {
            this.pipelineObjects = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject> pipelineObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PipelineObject>(pipelineObjects.size());
            pipelineObjectsCopy.addAll(pipelineObjects);
            this.pipelineObjects = pipelineObjectsCopy;
        }

        return this;
    }

    /**
     * The parameter objects used with the pipeline.
     *
     * @return The parameter objects used with the pipeline.
     */
    public java.util.List<ParameterObject> getParameterObjects() {
        if (parameterObjects == null) {
              parameterObjects = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject>();
              parameterObjects.setAutoConstruct(true);
        }
        return parameterObjects;
    }
    
    /**
     * The parameter objects used with the pipeline.
     *
     * @param parameterObjects The parameter objects used with the pipeline.
     */
    public void setParameterObjects(java.util.Collection<ParameterObject> parameterObjects) {
        if (parameterObjects == null) {
            this.parameterObjects = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject> parameterObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject>(parameterObjects.size());
        parameterObjectsCopy.addAll(parameterObjects);
        this.parameterObjects = parameterObjectsCopy;
    }
    
    /**
     * The parameter objects used with the pipeline.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameterObjects(java.util.Collection)} or {@link
     * #withParameterObjects(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterObjects The parameter objects used with the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutPipelineDefinitionRequest withParameterObjects(ParameterObject... parameterObjects) {
        if (getParameterObjects() == null) setParameterObjects(new java.util.ArrayList<ParameterObject>(parameterObjects.length));
        for (ParameterObject value : parameterObjects) {
            getParameterObjects().add(value);
        }
        return this;
    }
    
    /**
     * The parameter objects used with the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterObjects The parameter objects used with the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutPipelineDefinitionRequest withParameterObjects(java.util.Collection<ParameterObject> parameterObjects) {
        if (parameterObjects == null) {
            this.parameterObjects = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject> parameterObjectsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterObject>(parameterObjects.size());
            parameterObjectsCopy.addAll(parameterObjects);
            this.parameterObjects = parameterObjectsCopy;
        }

        return this;
    }

    /**
     * The parameter values used with the pipeline.
     *
     * @return The parameter values used with the pipeline.
     */
    public java.util.List<ParameterValue> getParameterValues() {
        if (parameterValues == null) {
              parameterValues = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>();
              parameterValues.setAutoConstruct(true);
        }
        return parameterValues;
    }
    
    /**
     * The parameter values used with the pipeline.
     *
     * @param parameterValues The parameter values used with the pipeline.
     */
    public void setParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>(parameterValues.size());
        parameterValuesCopy.addAll(parameterValues);
        this.parameterValues = parameterValuesCopy;
    }
    
    /**
     * The parameter values used with the pipeline.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameterValues(java.util.Collection)} or {@link
     * #withParameterValues(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValues The parameter values used with the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutPipelineDefinitionRequest withParameterValues(ParameterValue... parameterValues) {
        if (getParameterValues() == null) setParameterValues(new java.util.ArrayList<ParameterValue>(parameterValues.length));
        for (ParameterValue value : parameterValues) {
            getParameterValues().add(value);
        }
        return this;
    }
    
    /**
     * The parameter values used with the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterValues The parameter values used with the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutPipelineDefinitionRequest withParameterValues(java.util.Collection<ParameterValue> parameterValues) {
        if (parameterValues == null) {
            this.parameterValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue> parameterValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterValue>(parameterValues.size());
            parameterValuesCopy.addAll(parameterValues);
            this.parameterValues = parameterValuesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getPipelineObjects() != null) sb.append("PipelineObjects: " + getPipelineObjects() + ",");
        if (getParameterObjects() != null) sb.append("ParameterObjects: " + getParameterObjects() + ",");
        if (getParameterValues() != null) sb.append("ParameterValues: " + getParameterValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getPipelineObjects() == null) ? 0 : getPipelineObjects().hashCode()); 
        hashCode = prime * hashCode + ((getParameterObjects() == null) ? 0 : getParameterObjects().hashCode()); 
        hashCode = prime * hashCode + ((getParameterValues() == null) ? 0 : getParameterValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutPipelineDefinitionRequest == false) return false;
        PutPipelineDefinitionRequest other = (PutPipelineDefinitionRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getPipelineObjects() == null ^ this.getPipelineObjects() == null) return false;
        if (other.getPipelineObjects() != null && other.getPipelineObjects().equals(this.getPipelineObjects()) == false) return false; 
        if (other.getParameterObjects() == null ^ this.getParameterObjects() == null) return false;
        if (other.getParameterObjects() != null && other.getParameterObjects().equals(this.getParameterObjects()) == false) return false; 
        if (other.getParameterValues() == null ^ this.getParameterValues() == null) return false;
        if (other.getParameterValues() != null && other.getParameterValues().equals(this.getParameterValues()) == false) return false; 
        return true;
    }
    
    @Override
    public PutPipelineDefinitionRequest clone() {
        
            return (PutPipelineDefinitionRequest) super.clone();
    }

}
    