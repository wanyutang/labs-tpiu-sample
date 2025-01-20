package io.bootify.my_app.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import java.util.Set;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "Roles")
@EntityListeners(AuditingEntityListener.class)
public class Role {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Integer roleId;

    @Column(nullable = false, length = 50)
    private String roleName;

    @Column(length = 100)
    private String updateUser;

    @Column
    private OffsetDateTime updateDate;

    @Column(length = 100)
    private String createUser;

    @Column
    private OffsetDateTime createDate;

    @ManyToMany(mappedBy = "groupRoleRoles")
    private Set<Group> groupRoleGroups;

    @ManyToMany
    @JoinTable(
            name = "UserRoles",
            joinColumns = @JoinColumn(name = "roleId"),
            inverseJoinColumns = @JoinColumn(name = "userId")
    )
    private Set<AdminUser> userRoleAdminUsers;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(final Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(final String roleName) {
        this.roleName = roleName;
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

    public Set<Group> getGroupRoleGroups() {
        return groupRoleGroups;
    }

    public void setGroupRoleGroups(final Set<Group> groupRoleGroups) {
        this.groupRoleGroups = groupRoleGroups;
    }

    public Set<AdminUser> getUserRoleAdminUsers() {
        return userRoleAdminUsers;
    }

    public void setUserRoleAdminUsers(final Set<AdminUser> userRoleAdminUsers) {
        this.userRoleAdminUsers = userRoleAdminUsers;
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
