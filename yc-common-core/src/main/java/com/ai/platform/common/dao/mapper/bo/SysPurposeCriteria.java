package com.ai.platform.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysPurposeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysPurposeCriteria() {
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

        public Criteria andPurposeIdIsNull() {
            addCriterion("purpose_id is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIdIsNotNull() {
            addCriterion("purpose_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeIdEqualTo(String value) {
            addCriterion("purpose_id =", value, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdNotEqualTo(String value) {
            addCriterion("purpose_id <>", value, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdGreaterThan(String value) {
            addCriterion("purpose_id >", value, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_id >=", value, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdLessThan(String value) {
            addCriterion("purpose_id <", value, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdLessThanOrEqualTo(String value) {
            addCriterion("purpose_id <=", value, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdLike(String value) {
            addCriterion("purpose_id like", value, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdNotLike(String value) {
            addCriterion("purpose_id not like", value, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdIn(List<String> values) {
            addCriterion("purpose_id in", values, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdNotIn(List<String> values) {
            addCriterion("purpose_id not in", values, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdBetween(String value1, String value2) {
            addCriterion("purpose_id between", value1, value2, "purposeId");
            return (Criteria) this;
        }

        public Criteria andPurposeIdNotBetween(String value1, String value2) {
            addCriterion("purpose_id not between", value1, value2, "purposeId");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andPurposeNameIsNull() {
            addCriterion("purpose_name is null");
            return (Criteria) this;
        }

        public Criteria andPurposeNameIsNotNull() {
            addCriterion("purpose_name is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeNameEqualTo(String value) {
            addCriterion("purpose_name =", value, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameNotEqualTo(String value) {
            addCriterion("purpose_name <>", value, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameGreaterThan(String value) {
            addCriterion("purpose_name >", value, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameGreaterThanOrEqualTo(String value) {
            addCriterion("purpose_name >=", value, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameLessThan(String value) {
            addCriterion("purpose_name <", value, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameLessThanOrEqualTo(String value) {
            addCriterion("purpose_name <=", value, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameLike(String value) {
            addCriterion("purpose_name like", value, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameNotLike(String value) {
            addCriterion("purpose_name not like", value, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameIn(List<String> values) {
            addCriterion("purpose_name in", values, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameNotIn(List<String> values) {
            addCriterion("purpose_name not in", values, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameBetween(String value1, String value2) {
            addCriterion("purpose_name between", value1, value2, "purposeName");
            return (Criteria) this;
        }

        public Criteria andPurposeNameNotBetween(String value1, String value2) {
            addCriterion("purpose_name not between", value1, value2, "purposeName");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andNamedFlagIsNull() {
            addCriterion("named_flag is null");
            return (Criteria) this;
        }

        public Criteria andNamedFlagIsNotNull() {
            addCriterion("named_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNamedFlagEqualTo(String value) {
            addCriterion("named_flag =", value, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagNotEqualTo(String value) {
            addCriterion("named_flag <>", value, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagGreaterThan(String value) {
            addCriterion("named_flag >", value, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagGreaterThanOrEqualTo(String value) {
            addCriterion("named_flag >=", value, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagLessThan(String value) {
            addCriterion("named_flag <", value, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagLessThanOrEqualTo(String value) {
            addCriterion("named_flag <=", value, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagLike(String value) {
            addCriterion("named_flag like", value, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagNotLike(String value) {
            addCriterion("named_flag not like", value, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagIn(List<String> values) {
            addCriterion("named_flag in", values, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagNotIn(List<String> values) {
            addCriterion("named_flag not in", values, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagBetween(String value1, String value2) {
            addCriterion("named_flag between", value1, value2, "namedFlag");
            return (Criteria) this;
        }

        public Criteria andNamedFlagNotBetween(String value1, String value2) {
            addCriterion("named_flag not between", value1, value2, "namedFlag");
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