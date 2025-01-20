package io.bootify.my_app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import java.util.Set;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "AdminUsers")
@EntityListeners(AuditingEntityListener.class)
public class AdminUser {

    @Id
    @Column(nullable = false, updatable = false, length = 100)
    private String userId;

    @Column(nullable = false, length = 50)
    private String userName;

    @Column(length = 100)
    private String updateUser;

    @Column
    private OffsetDateTime updateDate;

    @Column(length = 100)
    private String createUser;

    @Column
    private OffsetDateTime createDate;

    @ManyToMany(mappedBy = "groupUserAdminUsers")
    private Set<Group> groupUserGroups;

    @ManyToMany(mappedBy = "userRoleAdminUsers")
    private Set<Role> userRoleRoles;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(final String updateUser) {
        this.updateUser = updateUser;
    }

    public OffsetDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(final OffsetDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(final String createUser) {
        this.createUser = createUser;
    }

    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(final OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public Set<Group> getGroupUserGroups() {
        return groupUserGroups;
    }

    public void setGroupUserGroups(final Set<Group> groupUserGroups) {
        this.groupUserGroups = groupUserGroups;
    }

    public Set<Role> getUserRoleRoles() {
        return userRoleRoles;
    }

    public void setUserRoleRoles(final Set<Role> userRoleRoles) {
        this.userRoleRoles = userRoleRoles;
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
