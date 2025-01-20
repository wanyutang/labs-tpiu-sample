package io.bootify.my_app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import java.util.Set;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "\"Groups\"")
@EntityListeners(AuditingEntityListener.class)
public class Group {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String groupCode;

    @Column(nullable = false, length = 50)
    private String groupName;

    @Column(length = 100)
    private String updateUser;

    @Column
    private OffsetDateTime updateDate;

    @Column(length = 100)
    private String createUser;

    @Column
    private OffsetDateTime createDate;

    @ManyToMany
    @JoinTable(
            name = "GroupRoles",
            joinColumns = @JoinColumn(name = "groupCode"),
            inverseJoinColumns = @JoinColumn(name = "roleId")
    )
    private Set<Role> groupRoleRoles;

    @ManyToMany
    @JoinTable(
            name = "GroupUsers",
            joinColumns = @JoinColumn(name = "groupCode"),
            inverseJoinColumns = @JoinColumn(name = "userId")
    )
    private Set<AdminUser> groupUserAdminUsers;

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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(final String groupName) {
        this.groupName = groupName;
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

    public Set<Role> getGroupRoleRoles() {
        return groupRoleRoles;
    }

    public void setGroupRoleRoles(final Set<Role> groupRoleRoles) {
        this.groupRoleRoles = groupRoleRoles;
    }

    public Set<AdminUser> getGroupUserAdminUsers() {
        return groupUserAdminUsers;
    }

    public void setGroupUserAdminUsers(final Set<AdminUser> groupUserAdminUsers) {
        this.groupUserAdminUsers = groupUserAdminUsers;
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
