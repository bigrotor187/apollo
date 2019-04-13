package com.ctrip.framework.apollo.portal.entity.model;


import com.ctrip.framework.apollo.common.utils.InputValidator;
import java.util.Set;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * App Model
 */
public class AppModel {

  /**
   * App 名
   */
  @NotBlank(message = "name cannot be blank")
  private String name;
  /**
   * App 编号
   */
  @NotBlank(message = "appId cannot be blank")
  @Pattern(
      regexp = InputValidator.CLUSTER_NAMESPACE_VALIDATOR,
      message = "AppId格式错误: " + InputValidator.INVALID_CLUSTER_NAMESPACE_MESSAGE
  )
  private String appId;
  /**
   * 部门编号
   */
  @NotBlank(message = "orgId cannot be blank")
  private String orgId;
  /**
   * 部门名称
   */
  @NotBlank(message = "orgName cannot be blank")
  private String orgName;
  /**
   * 拥有人姓名
   */
  @NotBlank(message = "ownerName cannot be blank")
  private String ownerName;
  /**
   * 管理员编号集合
   */
  private Set<String> admins;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public Set<String> getAdmins() {
    return admins;
  }

  public void setAdmins(Set<String> admins) {
    this.admins = admins;
  }
}
