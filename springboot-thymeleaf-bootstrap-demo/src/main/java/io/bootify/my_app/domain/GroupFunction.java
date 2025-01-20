package io.bootify.my_app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "GroupFunctions")
@EntityListeners(AuditingEntityListener.class)
public class GroupFunction {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String groupCode;

    @Column(nullable = false)
    private Integer functionId;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(final String groupCode) {
        this.groupCode = groupCode;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(final Integer functionId) {
        this.functionId = functionId;
    }

    public OffsetDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(final OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(final OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
