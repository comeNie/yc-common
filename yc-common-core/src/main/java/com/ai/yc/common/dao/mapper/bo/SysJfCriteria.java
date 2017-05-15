package com.ai.yc.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysJfCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysJfCriteria() {
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

        public Criteria andDidIsNull() {
            addCriterion("DID is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("DID is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(String value) {
            addCriterion("DID =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(String value) {
            addCriterion("DID <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(String value) {
            addCriterion("DID >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(String value) {
            addCriterion("DID >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(String value) {
            addCriterion("DID <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(String value) {
            addCriterion("DID <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLike(String value) {
            addCriterion("DID like", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotLike(String value) {
            addCriterion("DID not like", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<String> values) {
            addCriterion("DID in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<String> values) {
            addCriterion("DID not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(String value1, String value2) {
            addCriterion("DID between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(String value1, String value2) {
            addCriterion("DID not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andOneDayIsNull() {
            addCriterion("ONE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andOneDayIsNotNull() {
            addCriterion("ONE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andOneDayEqualTo(Integer value) {
            addCriterion("ONE_DAY =", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayNotEqualTo(Integer value) {
            addCriterion("ONE_DAY <>", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayGreaterThan(Integer value) {
            addCriterion("ONE_DAY >", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("ONE_DAY >=", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayLessThan(Integer value) {
            addCriterion("ONE_DAY <", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayLessThanOrEqualTo(Integer value) {
            addCriterion("ONE_DAY <=", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayIn(List<Integer> values) {
            addCriterion("ONE_DAY in", values, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayNotIn(List<Integer> values) {
            addCriterion("ONE_DAY not in", values, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayBetween(Integer value1, Integer value2) {
            addCriterion("ONE_DAY between", value1, value2, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayNotBetween(Integer value1, Integer value2) {
            addCriterion("ONE_DAY not between", value1, value2, "oneDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayIsNull() {
            addCriterion("TWO_DAY is null");
            return (Criteria) this;
        }

        public Criteria andTwoDayIsNotNull() {
            addCriterion("TWO_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andTwoDayEqualTo(Integer value) {
            addCriterion("TWO_DAY =", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayNotEqualTo(Integer value) {
            addCriterion("TWO_DAY <>", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayGreaterThan(Integer value) {
            addCriterion("TWO_DAY >", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("TWO_DAY >=", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayLessThan(Integer value) {
            addCriterion("TWO_DAY <", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayLessThanOrEqualTo(Integer value) {
            addCriterion("TWO_DAY <=", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayIn(List<Integer> values) {
            addCriterion("TWO_DAY in", values, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayNotIn(List<Integer> values) {
            addCriterion("TWO_DAY not in", values, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayBetween(Integer value1, Integer value2) {
            addCriterion("TWO_DAY between", value1, value2, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayNotBetween(Integer value1, Integer value2) {
            addCriterion("TWO_DAY not between", value1, value2, "twoDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayIsNull() {
            addCriterion("THREE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andThreeDayIsNotNull() {
            addCriterion("THREE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andThreeDayEqualTo(Integer value) {
            addCriterion("THREE_DAY =", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayNotEqualTo(Integer value) {
            addCriterion("THREE_DAY <>", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayGreaterThan(Integer value) {
            addCriterion("THREE_DAY >", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("THREE_DAY >=", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayLessThan(Integer value) {
            addCriterion("THREE_DAY <", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayLessThanOrEqualTo(Integer value) {
            addCriterion("THREE_DAY <=", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayIn(List<Integer> values) {
            addCriterion("THREE_DAY in", values, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayNotIn(List<Integer> values) {
            addCriterion("THREE_DAY not in", values, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayBetween(Integer value1, Integer value2) {
            addCriterion("THREE_DAY between", value1, value2, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayNotBetween(Integer value1, Integer value2) {
            addCriterion("THREE_DAY not between", value1, value2, "threeDay");
            return (Criteria) this;
        }

        public Criteria andFourDayIsNull() {
            addCriterion("FOUR_DAY is null");
            return (Criteria) this;
        }

        public Criteria andFourDayIsNotNull() {
            addCriterion("FOUR_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andFourDayEqualTo(Integer value) {
            addCriterion("FOUR_DAY =", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayNotEqualTo(Integer value) {
            addCriterion("FOUR_DAY <>", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayGreaterThan(Integer value) {
            addCriterion("FOUR_DAY >", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOUR_DAY >=", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayLessThan(Integer value) {
            addCriterion("FOUR_DAY <", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayLessThanOrEqualTo(Integer value) {
            addCriterion("FOUR_DAY <=", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayIn(List<Integer> values) {
            addCriterion("FOUR_DAY in", values, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayNotIn(List<Integer> values) {
            addCriterion("FOUR_DAY not in", values, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayBetween(Integer value1, Integer value2) {
            addCriterion("FOUR_DAY between", value1, value2, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayNotBetween(Integer value1, Integer value2) {
            addCriterion("FOUR_DAY not between", value1, value2, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayIsNull() {
            addCriterion("FIVE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andFiveDayIsNotNull() {
            addCriterion("FIVE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andFiveDayEqualTo(Integer value) {
            addCriterion("FIVE_DAY =", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayNotEqualTo(Integer value) {
            addCriterion("FIVE_DAY <>", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayGreaterThan(Integer value) {
            addCriterion("FIVE_DAY >", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIVE_DAY >=", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayLessThan(Integer value) {
            addCriterion("FIVE_DAY <", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayLessThanOrEqualTo(Integer value) {
            addCriterion("FIVE_DAY <=", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayIn(List<Integer> values) {
            addCriterion("FIVE_DAY in", values, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayNotIn(List<Integer> values) {
            addCriterion("FIVE_DAY not in", values, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayBetween(Integer value1, Integer value2) {
            addCriterion("FIVE_DAY between", value1, value2, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayNotBetween(Integer value1, Integer value2) {
            addCriterion("FIVE_DAY not between", value1, value2, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andSixDayIsNull() {
            addCriterion("SIX_DAY is null");
            return (Criteria) this;
        }

        public Criteria andSixDayIsNotNull() {
            addCriterion("SIX_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andSixDayEqualTo(Integer value) {
            addCriterion("SIX_DAY =", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayNotEqualTo(Integer value) {
            addCriterion("SIX_DAY <>", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayGreaterThan(Integer value) {
            addCriterion("SIX_DAY >", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIX_DAY >=", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayLessThan(Integer value) {
            addCriterion("SIX_DAY <", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayLessThanOrEqualTo(Integer value) {
            addCriterion("SIX_DAY <=", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayIn(List<Integer> values) {
            addCriterion("SIX_DAY in", values, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayNotIn(List<Integer> values) {
            addCriterion("SIX_DAY not in", values, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayBetween(Integer value1, Integer value2) {
            addCriterion("SIX_DAY between", value1, value2, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayNotBetween(Integer value1, Integer value2) {
            addCriterion("SIX_DAY not between", value1, value2, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayIsNull() {
            addCriterion("SEVEN_DAY is null");
            return (Criteria) this;
        }

        public Criteria andSevenDayIsNotNull() {
            addCriterion("SEVEN_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andSevenDayEqualTo(Integer value) {
            addCriterion("SEVEN_DAY =", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayNotEqualTo(Integer value) {
            addCriterion("SEVEN_DAY <>", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayGreaterThan(Integer value) {
            addCriterion("SEVEN_DAY >", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEVEN_DAY >=", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayLessThan(Integer value) {
            addCriterion("SEVEN_DAY <", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayLessThanOrEqualTo(Integer value) {
            addCriterion("SEVEN_DAY <=", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayIn(List<Integer> values) {
            addCriterion("SEVEN_DAY in", values, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayNotIn(List<Integer> values) {
            addCriterion("SEVEN_DAY not in", values, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayBetween(Integer value1, Integer value2) {
            addCriterion("SEVEN_DAY between", value1, value2, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayNotBetween(Integer value1, Integer value2) {
            addCriterion("SEVEN_DAY not between", value1, value2, "sevenDay");
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