package com.steve.authority.admin.dao;

import com.steve.authority.admin.model.SysLoginLog;
import com.steve.authority.admin.model.SysLoginLogKey;

public interface SysLoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int deleteByPrimaryKey(SysLoginLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int insert(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int insertSelective(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    SysLoginLog selectByPrimaryKey(SysLoginLogKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int updateByPrimaryKeySelective(SysLoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_login_log
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int updateByPrimaryKey(SysLoginLog record);
}