package com.zhiyou100.ssm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("u_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("u_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("u_pwd =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("u_pwd <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("u_pwd >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_pwd >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("u_pwd <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("u_pwd <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("u_pwd like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("u_pwd not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("u_pwd in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("u_pwd not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("u_pwd between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("u_pwd not between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidIsNull() {
            addCriterion("u_departmentid is null");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidIsNotNull() {
            addCriterion("u_departmentid is not null");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidEqualTo(Integer value) {
            addCriterion("u_departmentid =", value, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidNotEqualTo(Integer value) {
            addCriterion("u_departmentid <>", value, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidGreaterThan(Integer value) {
            addCriterion("u_departmentid >", value, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_departmentid >=", value, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidLessThan(Integer value) {
            addCriterion("u_departmentid <", value, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("u_departmentid <=", value, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidIn(List<Integer> values) {
            addCriterion("u_departmentid in", values, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidNotIn(List<Integer> values) {
            addCriterion("u_departmentid not in", values, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("u_departmentid between", value1, value2, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andUDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_departmentid not between", value1, value2, "uDepartmentid");
            return (Criteria) this;
        }

        public Criteria andURoleidIsNull() {
            addCriterion("u_roleid is null");
            return (Criteria) this;
        }

        public Criteria andURoleidIsNotNull() {
            addCriterion("u_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andURoleidEqualTo(Integer value) {
            addCriterion("u_roleid =", value, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidNotEqualTo(Integer value) {
            addCriterion("u_roleid <>", value, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidGreaterThan(Integer value) {
            addCriterion("u_roleid >", value, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_roleid >=", value, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidLessThan(Integer value) {
            addCriterion("u_roleid <", value, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidLessThanOrEqualTo(Integer value) {
            addCriterion("u_roleid <=", value, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidIn(List<Integer> values) {
            addCriterion("u_roleid in", values, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidNotIn(List<Integer> values) {
            addCriterion("u_roleid not in", values, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidBetween(Integer value1, Integer value2) {
            addCriterion("u_roleid between", value1, value2, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andURoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_roleid not between", value1, value2, "uRoleid");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("u_sex like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("u_sex not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNull() {
            addCriterion("u_address is null");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNotNull() {
            addCriterion("u_address is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressEqualTo(String value) {
            addCriterion("u_address =", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotEqualTo(String value) {
            addCriterion("u_address <>", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThan(String value) {
            addCriterion("u_address >", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThanOrEqualTo(String value) {
            addCriterion("u_address >=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThan(String value) {
            addCriterion("u_address <", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThanOrEqualTo(String value) {
            addCriterion("u_address <=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLike(String value) {
            addCriterion("u_address like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotLike(String value) {
            addCriterion("u_address not like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressIn(List<String> values) {
            addCriterion("u_address in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotIn(List<String> values) {
            addCriterion("u_address not in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressBetween(String value1, String value2) {
            addCriterion("u_address between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotBetween(String value1, String value2) {
            addCriterion("u_address not between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNull() {
            addCriterion("u_age is null");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNotNull() {
            addCriterion("u_age is not null");
            return (Criteria) this;
        }

        public Criteria andUAgeEqualTo(Integer value) {
            addCriterion("u_age =", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotEqualTo(Integer value) {
            addCriterion("u_age <>", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThan(Integer value) {
            addCriterion("u_age >", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_age >=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThan(Integer value) {
            addCriterion("u_age <", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThanOrEqualTo(Integer value) {
            addCriterion("u_age <=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeIn(List<Integer> values) {
            addCriterion("u_age in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotIn(List<Integer> values) {
            addCriterion("u_age not in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeBetween(Integer value1, Integer value2) {
            addCriterion("u_age between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("u_age not between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUTelphoneIsNull() {
            addCriterion("u_telphone is null");
            return (Criteria) this;
        }

        public Criteria andUTelphoneIsNotNull() {
            addCriterion("u_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andUTelphoneEqualTo(String value) {
            addCriterion("u_telphone =", value, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneNotEqualTo(String value) {
            addCriterion("u_telphone <>", value, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneGreaterThan(String value) {
            addCriterion("u_telphone >", value, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_telphone >=", value, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneLessThan(String value) {
            addCriterion("u_telphone <", value, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneLessThanOrEqualTo(String value) {
            addCriterion("u_telphone <=", value, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneLike(String value) {
            addCriterion("u_telphone like", value, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneNotLike(String value) {
            addCriterion("u_telphone not like", value, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneIn(List<String> values) {
            addCriterion("u_telphone in", values, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneNotIn(List<String> values) {
            addCriterion("u_telphone not in", values, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneBetween(String value1, String value2) {
            addCriterion("u_telphone between", value1, value2, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUTelphoneNotBetween(String value1, String value2) {
            addCriterion("u_telphone not between", value1, value2, "uTelphone");
            return (Criteria) this;
        }

        public Criteria andUIdcardIsNull() {
            addCriterion("u_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUIdcardIsNotNull() {
            addCriterion("u_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUIdcardEqualTo(String value) {
            addCriterion("u_idcard =", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotEqualTo(String value) {
            addCriterion("u_idcard <>", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardGreaterThan(String value) {
            addCriterion("u_idcard >", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("u_idcard >=", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLessThan(String value) {
            addCriterion("u_idcard <", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLessThanOrEqualTo(String value) {
            addCriterion("u_idcard <=", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLike(String value) {
            addCriterion("u_idcard like", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotLike(String value) {
            addCriterion("u_idcard not like", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardIn(List<String> values) {
            addCriterion("u_idcard in", values, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotIn(List<String> values) {
            addCriterion("u_idcard not in", values, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardBetween(String value1, String value2) {
            addCriterion("u_idcard between", value1, value2, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotBetween(String value1, String value2) {
            addCriterion("u_idcard not between", value1, value2, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUMailIsNull() {
            addCriterion("u_mail is null");
            return (Criteria) this;
        }

        public Criteria andUMailIsNotNull() {
            addCriterion("u_mail is not null");
            return (Criteria) this;
        }

        public Criteria andUMailEqualTo(String value) {
            addCriterion("u_mail =", value, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailNotEqualTo(String value) {
            addCriterion("u_mail <>", value, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailGreaterThan(String value) {
            addCriterion("u_mail >", value, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailGreaterThanOrEqualTo(String value) {
            addCriterion("u_mail >=", value, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailLessThan(String value) {
            addCriterion("u_mail <", value, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailLessThanOrEqualTo(String value) {
            addCriterion("u_mail <=", value, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailLike(String value) {
            addCriterion("u_mail like", value, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailNotLike(String value) {
            addCriterion("u_mail not like", value, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailIn(List<String> values) {
            addCriterion("u_mail in", values, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailNotIn(List<String> values) {
            addCriterion("u_mail not in", values, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailBetween(String value1, String value2) {
            addCriterion("u_mail between", value1, value2, "uMail");
            return (Criteria) this;
        }

        public Criteria andUMailNotBetween(String value1, String value2) {
            addCriterion("u_mail not between", value1, value2, "uMail");
            return (Criteria) this;
        }

        public Criteria andUQqIsNull() {
            addCriterion("u_qq is null");
            return (Criteria) this;
        }

        public Criteria andUQqIsNotNull() {
            addCriterion("u_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUQqEqualTo(String value) {
            addCriterion("u_qq =", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotEqualTo(String value) {
            addCriterion("u_qq <>", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqGreaterThan(String value) {
            addCriterion("u_qq >", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqGreaterThanOrEqualTo(String value) {
            addCriterion("u_qq >=", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLessThan(String value) {
            addCriterion("u_qq <", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLessThanOrEqualTo(String value) {
            addCriterion("u_qq <=", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLike(String value) {
            addCriterion("u_qq like", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotLike(String value) {
            addCriterion("u_qq not like", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqIn(List<String> values) {
            addCriterion("u_qq in", values, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotIn(List<String> values) {
            addCriterion("u_qq not in", values, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqBetween(String value1, String value2) {
            addCriterion("u_qq between", value1, value2, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotBetween(String value1, String value2) {
            addCriterion("u_qq not between", value1, value2, "uQq");
            return (Criteria) this;
        }

        public Criteria andUHobbyIsNull() {
            addCriterion("u_hobby is null");
            return (Criteria) this;
        }

        public Criteria andUHobbyIsNotNull() {
            addCriterion("u_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andUHobbyEqualTo(String value) {
            addCriterion("u_hobby =", value, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyNotEqualTo(String value) {
            addCriterion("u_hobby <>", value, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyGreaterThan(String value) {
            addCriterion("u_hobby >", value, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("u_hobby >=", value, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyLessThan(String value) {
            addCriterion("u_hobby <", value, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyLessThanOrEqualTo(String value) {
            addCriterion("u_hobby <=", value, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyLike(String value) {
            addCriterion("u_hobby like", value, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyNotLike(String value) {
            addCriterion("u_hobby not like", value, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyIn(List<String> values) {
            addCriterion("u_hobby in", values, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyNotIn(List<String> values) {
            addCriterion("u_hobby not in", values, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyBetween(String value1, String value2) {
            addCriterion("u_hobby between", value1, value2, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUHobbyNotBetween(String value1, String value2) {
            addCriterion("u_hobby not between", value1, value2, "uHobby");
            return (Criteria) this;
        }

        public Criteria andUEduIsNull() {
            addCriterion("u_edu is null");
            return (Criteria) this;
        }

        public Criteria andUEduIsNotNull() {
            addCriterion("u_edu is not null");
            return (Criteria) this;
        }

        public Criteria andUEduEqualTo(String value) {
            addCriterion("u_edu =", value, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduNotEqualTo(String value) {
            addCriterion("u_edu <>", value, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduGreaterThan(String value) {
            addCriterion("u_edu >", value, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduGreaterThanOrEqualTo(String value) {
            addCriterion("u_edu >=", value, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduLessThan(String value) {
            addCriterion("u_edu <", value, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduLessThanOrEqualTo(String value) {
            addCriterion("u_edu <=", value, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduLike(String value) {
            addCriterion("u_edu like", value, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduNotLike(String value) {
            addCriterion("u_edu not like", value, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduIn(List<String> values) {
            addCriterion("u_edu in", values, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduNotIn(List<String> values) {
            addCriterion("u_edu not in", values, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduBetween(String value1, String value2) {
            addCriterion("u_edu between", value1, value2, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUEduNotBetween(String value1, String value2) {
            addCriterion("u_edu not between", value1, value2, "uEdu");
            return (Criteria) this;
        }

        public Criteria andUSalarycardIsNull() {
            addCriterion("u_salarycard is null");
            return (Criteria) this;
        }

        public Criteria andUSalarycardIsNotNull() {
            addCriterion("u_salarycard is not null");
            return (Criteria) this;
        }

        public Criteria andUSalarycardEqualTo(String value) {
            addCriterion("u_salarycard =", value, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardNotEqualTo(String value) {
            addCriterion("u_salarycard <>", value, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardGreaterThan(String value) {
            addCriterion("u_salarycard >", value, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardGreaterThanOrEqualTo(String value) {
            addCriterion("u_salarycard >=", value, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardLessThan(String value) {
            addCriterion("u_salarycard <", value, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardLessThanOrEqualTo(String value) {
            addCriterion("u_salarycard <=", value, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardLike(String value) {
            addCriterion("u_salarycard like", value, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardNotLike(String value) {
            addCriterion("u_salarycard not like", value, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardIn(List<String> values) {
            addCriterion("u_salarycard in", values, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardNotIn(List<String> values) {
            addCriterion("u_salarycard not in", values, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardBetween(String value1, String value2) {
            addCriterion("u_salarycard between", value1, value2, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUSalarycardNotBetween(String value1, String value2) {
            addCriterion("u_salarycard not between", value1, value2, "uSalarycard");
            return (Criteria) this;
        }

        public Criteria andUNationIsNull() {
            addCriterion("u_nation is null");
            return (Criteria) this;
        }

        public Criteria andUNationIsNotNull() {
            addCriterion("u_nation is not null");
            return (Criteria) this;
        }

        public Criteria andUNationEqualTo(String value) {
            addCriterion("u_nation =", value, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationNotEqualTo(String value) {
            addCriterion("u_nation <>", value, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationGreaterThan(String value) {
            addCriterion("u_nation >", value, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationGreaterThanOrEqualTo(String value) {
            addCriterion("u_nation >=", value, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationLessThan(String value) {
            addCriterion("u_nation <", value, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationLessThanOrEqualTo(String value) {
            addCriterion("u_nation <=", value, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationLike(String value) {
            addCriterion("u_nation like", value, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationNotLike(String value) {
            addCriterion("u_nation not like", value, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationIn(List<String> values) {
            addCriterion("u_nation in", values, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationNotIn(List<String> values) {
            addCriterion("u_nation not in", values, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationBetween(String value1, String value2) {
            addCriterion("u_nation between", value1, value2, "uNation");
            return (Criteria) this;
        }

        public Criteria andUNationNotBetween(String value1, String value2) {
            addCriterion("u_nation not between", value1, value2, "uNation");
            return (Criteria) this;
        }

        public Criteria andUMarryIsNull() {
            addCriterion("u_marry is null");
            return (Criteria) this;
        }

        public Criteria andUMarryIsNotNull() {
            addCriterion("u_marry is not null");
            return (Criteria) this;
        }

        public Criteria andUMarryEqualTo(String value) {
            addCriterion("u_marry =", value, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryNotEqualTo(String value) {
            addCriterion("u_marry <>", value, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryGreaterThan(String value) {
            addCriterion("u_marry >", value, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryGreaterThanOrEqualTo(String value) {
            addCriterion("u_marry >=", value, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryLessThan(String value) {
            addCriterion("u_marry <", value, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryLessThanOrEqualTo(String value) {
            addCriterion("u_marry <=", value, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryLike(String value) {
            addCriterion("u_marry like", value, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryNotLike(String value) {
            addCriterion("u_marry not like", value, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryIn(List<String> values) {
            addCriterion("u_marry in", values, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryNotIn(List<String> values) {
            addCriterion("u_marry not in", values, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryBetween(String value1, String value2) {
            addCriterion("u_marry between", value1, value2, "uMarry");
            return (Criteria) this;
        }

        public Criteria andUMarryNotBetween(String value1, String value2) {
            addCriterion("u_marry not between", value1, value2, "uMarry");
            return (Criteria) this;
        }

        public Criteria andURemarkIsNull() {
            addCriterion("u_remark is null");
            return (Criteria) this;
        }

        public Criteria andURemarkIsNotNull() {
            addCriterion("u_remark is not null");
            return (Criteria) this;
        }

        public Criteria andURemarkEqualTo(String value) {
            addCriterion("u_remark =", value, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkNotEqualTo(String value) {
            addCriterion("u_remark <>", value, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkGreaterThan(String value) {
            addCriterion("u_remark >", value, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkGreaterThanOrEqualTo(String value) {
            addCriterion("u_remark >=", value, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkLessThan(String value) {
            addCriterion("u_remark <", value, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkLessThanOrEqualTo(String value) {
            addCriterion("u_remark <=", value, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkLike(String value) {
            addCriterion("u_remark like", value, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkNotLike(String value) {
            addCriterion("u_remark not like", value, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkIn(List<String> values) {
            addCriterion("u_remark in", values, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkNotIn(List<String> values) {
            addCriterion("u_remark not in", values, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkBetween(String value1, String value2) {
            addCriterion("u_remark between", value1, value2, "uRemark");
            return (Criteria) this;
        }

        public Criteria andURemarkNotBetween(String value1, String value2) {
            addCriterion("u_remark not between", value1, value2, "uRemark");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeIsNull() {
            addCriterion("u_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeIsNotNull() {
            addCriterion("u_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeEqualTo(Date value) {
            addCriterion("u_updatetime =", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeNotEqualTo(Date value) {
            addCriterion("u_updatetime <>", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeGreaterThan(Date value) {
            addCriterion("u_updatetime >", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("u_updatetime >=", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeLessThan(Date value) {
            addCriterion("u_updatetime <", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("u_updatetime <=", value, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeIn(List<Date> values) {
            addCriterion("u_updatetime in", values, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeNotIn(List<Date> values) {
            addCriterion("u_updatetime not in", values, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("u_updatetime between", value1, value2, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("u_updatetime not between", value1, value2, "uUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUPicIsNull() {
            addCriterion("u_pic is null");
            return (Criteria) this;
        }

        public Criteria andUPicIsNotNull() {
            addCriterion("u_pic is not null");
            return (Criteria) this;
        }

        public Criteria andUPicEqualTo(String value) {
            addCriterion("u_pic =", value, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicNotEqualTo(String value) {
            addCriterion("u_pic <>", value, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicGreaterThan(String value) {
            addCriterion("u_pic >", value, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicGreaterThanOrEqualTo(String value) {
            addCriterion("u_pic >=", value, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicLessThan(String value) {
            addCriterion("u_pic <", value, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicLessThanOrEqualTo(String value) {
            addCriterion("u_pic <=", value, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicLike(String value) {
            addCriterion("u_pic like", value, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicNotLike(String value) {
            addCriterion("u_pic not like", value, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicIn(List<String> values) {
            addCriterion("u_pic in", values, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicNotIn(List<String> values) {
            addCriterion("u_pic not in", values, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicBetween(String value1, String value2) {
            addCriterion("u_pic between", value1, value2, "uPic");
            return (Criteria) this;
        }

        public Criteria andUPicNotBetween(String value1, String value2) {
            addCriterion("u_pic not between", value1, value2, "uPic");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}