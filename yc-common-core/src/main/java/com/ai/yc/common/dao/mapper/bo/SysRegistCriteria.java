package com.ai.yc.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysRegistCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysRegistCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(String value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(String value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(String value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(String value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(String value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(String value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLike(String value) {
            addCriterion("AID like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotLike(String value) {
            addCriterion("AID not like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<String> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<String> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(String value1, String value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(String value1, String value2) {
            addCriterion("AID not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andActiviceNameIsNull() {
            addCriterion("ACTIVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActiviceNameIsNotNull() {
            addCriterion("ACTIVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActiviceNameEqualTo(String value) {
            addCriterion("ACTIVICE_NAME =", value, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameNotEqualTo(String value) {
            addCriterion("ACTIVICE_NAME <>", value, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameGreaterThan(String value) {
            addCriterion("ACTIVICE_NAME >", value, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVICE_NAME >=", value, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameLessThan(String value) {
            addCriterion("ACTIVICE_NAME <", value, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameLessThanOrEqualTo(String value) {
            addCriterion("ACTIVICE_NAME <=", value, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameLike(String value) {
            addCriterion("ACTIVICE_NAME like", value, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameNotLike(String value) {
            addCriterion("ACTIVICE_NAME not like", value, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameIn(List<String> values) {
            addCriterion("ACTIVICE_NAME in", values, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameNotIn(List<String> values) {
            addCriterion("ACTIVICE_NAME not in", values, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameBetween(String value1, String value2) {
            addCriterion("ACTIVICE_NAME between", value1, value2, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNameNotBetween(String value1, String value2) {
            addCriterion("ACTIVICE_NAME not between", value1, value2, "activiceName");
            return (Criteria) this;
        }

        public Criteria andActiviceNumIsNull() {
            addCriterion("ACTIVICE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andActiviceNumIsNotNull() {
            addCriterion("ACTIVICE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andActiviceNumEqualTo(Integer value) {
            addCriterion("ACTIVICE_NUM =", value, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumNotEqualTo(Integer value) {
            addCriterion("ACTIVICE_NUM <>", value, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumGreaterThan(Integer value) {
            addCriterion("ACTIVICE_NUM >", value, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVICE_NUM >=", value, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumLessThan(Integer value) {
            addCriterion("ACTIVICE_NUM <", value, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVICE_NUM <=", value, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumIn(List<Integer> values) {
            addCriterion("ACTIVICE_NUM in", values, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumNotIn(List<Integer> values) {
            addCriterion("ACTIVICE_NUM not in", values, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVICE_NUM between", value1, value2, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andActiviceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVICE_NUM not between", value1, value2, "activiceNum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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