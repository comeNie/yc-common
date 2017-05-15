package com.ai.yc.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysBasicCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysBasicCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberIsNull() {
            addCriterion("ORDINAYRY_MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberIsNotNull() {
            addCriterion("ORDINAYRY_MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberEqualTo(Integer value) {
            addCriterion("ORDINAYRY_MEMBER =", value, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberNotEqualTo(Integer value) {
            addCriterion("ORDINAYRY_MEMBER <>", value, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberGreaterThan(Integer value) {
            addCriterion("ORDINAYRY_MEMBER >", value, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDINAYRY_MEMBER >=", value, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberLessThan(Integer value) {
            addCriterion("ORDINAYRY_MEMBER <", value, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberLessThanOrEqualTo(Integer value) {
            addCriterion("ORDINAYRY_MEMBER <=", value, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberIn(List<Integer> values) {
            addCriterion("ORDINAYRY_MEMBER in", values, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberNotIn(List<Integer> values) {
            addCriterion("ORDINAYRY_MEMBER not in", values, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberBetween(Integer value1, Integer value2) {
            addCriterion("ORDINAYRY_MEMBER between", value1, value2, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andOrdinayryMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDINAYRY_MEMBER not between", value1, value2, "ordinayryMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberIsNull() {
            addCriterion("GOLD_MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andGoldMemberIsNotNull() {
            addCriterion("GOLD_MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGoldMemberEqualTo(Integer value) {
            addCriterion("GOLD_MEMBER =", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberNotEqualTo(Integer value) {
            addCriterion("GOLD_MEMBER <>", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberGreaterThan(Integer value) {
            addCriterion("GOLD_MEMBER >", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOLD_MEMBER >=", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberLessThan(Integer value) {
            addCriterion("GOLD_MEMBER <", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberLessThanOrEqualTo(Integer value) {
            addCriterion("GOLD_MEMBER <=", value, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberIn(List<Integer> values) {
            addCriterion("GOLD_MEMBER in", values, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberNotIn(List<Integer> values) {
            addCriterion("GOLD_MEMBER not in", values, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberBetween(Integer value1, Integer value2) {
            addCriterion("GOLD_MEMBER between", value1, value2, "goldMember");
            return (Criteria) this;
        }

        public Criteria andGoldMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("GOLD_MEMBER not between", value1, value2, "goldMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberIsNull() {
            addCriterion("PLATINUM_MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberIsNotNull() {
            addCriterion("PLATINUM_MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberEqualTo(Integer value) {
            addCriterion("PLATINUM_MEMBER =", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberNotEqualTo(Integer value) {
            addCriterion("PLATINUM_MEMBER <>", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberGreaterThan(Integer value) {
            addCriterion("PLATINUM_MEMBER >", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLATINUM_MEMBER >=", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberLessThan(Integer value) {
            addCriterion("PLATINUM_MEMBER <", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberLessThanOrEqualTo(Integer value) {
            addCriterion("PLATINUM_MEMBER <=", value, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberIn(List<Integer> values) {
            addCriterion("PLATINUM_MEMBER in", values, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberNotIn(List<Integer> values) {
            addCriterion("PLATINUM_MEMBER not in", values, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberBetween(Integer value1, Integer value2) {
            addCriterion("PLATINUM_MEMBER between", value1, value2, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andPlatinumMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("PLATINUM_MEMBER not between", value1, value2, "platinumMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberIsNull() {
            addCriterion("MASONY_MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberIsNotNull() {
            addCriterion("MASONY_MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberEqualTo(Integer value) {
            addCriterion("MASONY_MEMBER =", value, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberNotEqualTo(Integer value) {
            addCriterion("MASONY_MEMBER <>", value, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberGreaterThan(Integer value) {
            addCriterion("MASONY_MEMBER >", value, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("MASONY_MEMBER >=", value, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberLessThan(Integer value) {
            addCriterion("MASONY_MEMBER <", value, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberLessThanOrEqualTo(Integer value) {
            addCriterion("MASONY_MEMBER <=", value, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberIn(List<Integer> values) {
            addCriterion("MASONY_MEMBER in", values, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberNotIn(List<Integer> values) {
            addCriterion("MASONY_MEMBER not in", values, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberBetween(Integer value1, Integer value2) {
            addCriterion("MASONY_MEMBER between", value1, value2, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andMasonyMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("MASONY_MEMBER not between", value1, value2, "masonyMember");
            return (Criteria) this;
        }

        public Criteria andCapValueIsNull() {
            addCriterion("CAP_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCapValueIsNotNull() {
            addCriterion("CAP_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCapValueEqualTo(Integer value) {
            addCriterion("CAP_VALUE =", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueNotEqualTo(Integer value) {
            addCriterion("CAP_VALUE <>", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueGreaterThan(Integer value) {
            addCriterion("CAP_VALUE >", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAP_VALUE >=", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueLessThan(Integer value) {
            addCriterion("CAP_VALUE <", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueLessThanOrEqualTo(Integer value) {
            addCriterion("CAP_VALUE <=", value, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueIn(List<Integer> values) {
            addCriterion("CAP_VALUE in", values, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueNotIn(List<Integer> values) {
            addCriterion("CAP_VALUE not in", values, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueBetween(Integer value1, Integer value2) {
            addCriterion("CAP_VALUE between", value1, value2, "capValue");
            return (Criteria) this;
        }

        public Criteria andCapValueNotBetween(Integer value1, Integer value2) {
            addCriterion("CAP_VALUE not between", value1, value2, "capValue");
            return (Criteria) this;
        }

        public Criteria andV1PointsIsNull() {
            addCriterion("V1_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andV1PointsIsNotNull() {
            addCriterion("V1_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andV1PointsEqualTo(Integer value) {
            addCriterion("V1_POINTS =", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsNotEqualTo(Integer value) {
            addCriterion("V1_POINTS <>", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsGreaterThan(Integer value) {
            addCriterion("V1_POINTS >", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("V1_POINTS >=", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsLessThan(Integer value) {
            addCriterion("V1_POINTS <", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsLessThanOrEqualTo(Integer value) {
            addCriterion("V1_POINTS <=", value, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsIn(List<Integer> values) {
            addCriterion("V1_POINTS in", values, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsNotIn(List<Integer> values) {
            addCriterion("V1_POINTS not in", values, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsBetween(Integer value1, Integer value2) {
            addCriterion("V1_POINTS between", value1, value2, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV1PointsNotBetween(Integer value1, Integer value2) {
            addCriterion("V1_POINTS not between", value1, value2, "v1Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsIsNull() {
            addCriterion("V2_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andV2PointsIsNotNull() {
            addCriterion("V2_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andV2PointsEqualTo(Integer value) {
            addCriterion("V2_POINTS =", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsNotEqualTo(Integer value) {
            addCriterion("V2_POINTS <>", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsGreaterThan(Integer value) {
            addCriterion("V2_POINTS >", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("V2_POINTS >=", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsLessThan(Integer value) {
            addCriterion("V2_POINTS <", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsLessThanOrEqualTo(Integer value) {
            addCriterion("V2_POINTS <=", value, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsIn(List<Integer> values) {
            addCriterion("V2_POINTS in", values, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsNotIn(List<Integer> values) {
            addCriterion("V2_POINTS not in", values, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsBetween(Integer value1, Integer value2) {
            addCriterion("V2_POINTS between", value1, value2, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV2PointsNotBetween(Integer value1, Integer value2) {
            addCriterion("V2_POINTS not between", value1, value2, "v2Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsIsNull() {
            addCriterion("V3_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andV3PointsIsNotNull() {
            addCriterion("V3_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andV3PointsEqualTo(Integer value) {
            addCriterion("V3_POINTS =", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsNotEqualTo(Integer value) {
            addCriterion("V3_POINTS <>", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsGreaterThan(Integer value) {
            addCriterion("V3_POINTS >", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("V3_POINTS >=", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsLessThan(Integer value) {
            addCriterion("V3_POINTS <", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsLessThanOrEqualTo(Integer value) {
            addCriterion("V3_POINTS <=", value, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsIn(List<Integer> values) {
            addCriterion("V3_POINTS in", values, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsNotIn(List<Integer> values) {
            addCriterion("V3_POINTS not in", values, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsBetween(Integer value1, Integer value2) {
            addCriterion("V3_POINTS between", value1, value2, "v3Points");
            return (Criteria) this;
        }

        public Criteria andV3PointsNotBetween(Integer value1, Integer value2) {
            addCriterion("V3_POINTS not between", value1, value2, "v3Points");
            return (Criteria) this;
        }

        public Criteria andLspPointsIsNull() {
            addCriterion("LSP_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andLspPointsIsNotNull() {
            addCriterion("LSP_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andLspPointsEqualTo(Integer value) {
            addCriterion("LSP_POINTS =", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsNotEqualTo(Integer value) {
            addCriterion("LSP_POINTS <>", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsGreaterThan(Integer value) {
            addCriterion("LSP_POINTS >", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("LSP_POINTS >=", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsLessThan(Integer value) {
            addCriterion("LSP_POINTS <", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsLessThanOrEqualTo(Integer value) {
            addCriterion("LSP_POINTS <=", value, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsIn(List<Integer> values) {
            addCriterion("LSP_POINTS in", values, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsNotIn(List<Integer> values) {
            addCriterion("LSP_POINTS not in", values, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsBetween(Integer value1, Integer value2) {
            addCriterion("LSP_POINTS between", value1, value2, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLspPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("LSP_POINTS not between", value1, value2, "lspPoints");
            return (Criteria) this;
        }

        public Criteria andLgdateNumIsNull() {
            addCriterion("LGDATE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLgdateNumIsNotNull() {
            addCriterion("LGDATE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLgdateNumEqualTo(Integer value) {
            addCriterion("LGDATE_NUM =", value, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumNotEqualTo(Integer value) {
            addCriterion("LGDATE_NUM <>", value, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumGreaterThan(Integer value) {
            addCriterion("LGDATE_NUM >", value, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LGDATE_NUM >=", value, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumLessThan(Integer value) {
            addCriterion("LGDATE_NUM <", value, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumLessThanOrEqualTo(Integer value) {
            addCriterion("LGDATE_NUM <=", value, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumIn(List<Integer> values) {
            addCriterion("LGDATE_NUM in", values, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumNotIn(List<Integer> values) {
            addCriterion("LGDATE_NUM not in", values, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumBetween(Integer value1, Integer value2) {
            addCriterion("LGDATE_NUM between", value1, value2, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andLgdateNumNotBetween(Integer value1, Integer value2) {
            addCriterion("LGDATE_NUM not between", value1, value2, "lgdateNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumIsNull() {
            addCriterion("CUSTOM_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCustomNumIsNotNull() {
            addCriterion("CUSTOM_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNumEqualTo(Integer value) {
            addCriterion("CUSTOM_NUM =", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotEqualTo(Integer value) {
            addCriterion("CUSTOM_NUM <>", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumGreaterThan(Integer value) {
            addCriterion("CUSTOM_NUM >", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOM_NUM >=", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumLessThan(Integer value) {
            addCriterion("CUSTOM_NUM <", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOM_NUM <=", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumIn(List<Integer> values) {
            addCriterion("CUSTOM_NUM in", values, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotIn(List<Integer> values) {
            addCriterion("CUSTOM_NUM not in", values, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOM_NUM between", value1, value2, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOM_NUM not between", value1, value2, "customNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumIsNull() {
            addCriterion("INTERPRETER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumIsNotNull() {
            addCriterion("INTERPRETER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumEqualTo(Integer value) {
            addCriterion("INTERPRETER_NUM =", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumNotEqualTo(Integer value) {
            addCriterion("INTERPRETER_NUM <>", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumGreaterThan(Integer value) {
            addCriterion("INTERPRETER_NUM >", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("INTERPRETER_NUM >=", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumLessThan(Integer value) {
            addCriterion("INTERPRETER_NUM <", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumLessThanOrEqualTo(Integer value) {
            addCriterion("INTERPRETER_NUM <=", value, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumIn(List<Integer> values) {
            addCriterion("INTERPRETER_NUM in", values, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumNotIn(List<Integer> values) {
            addCriterion("INTERPRETER_NUM not in", values, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumBetween(Integer value1, Integer value2) {
            addCriterion("INTERPRETER_NUM between", value1, value2, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andInterpreterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("INTERPRETER_NUM not between", value1, value2, "interpreterNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumIsNull() {
            addCriterion("LANGUAGE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLanguageNumIsNotNull() {
            addCriterion("LANGUAGE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageNumEqualTo(Integer value) {
            addCriterion("LANGUAGE_NUM =", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumNotEqualTo(Integer value) {
            addCriterion("LANGUAGE_NUM <>", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumGreaterThan(Integer value) {
            addCriterion("LANGUAGE_NUM >", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("LANGUAGE_NUM >=", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumLessThan(Integer value) {
            addCriterion("LANGUAGE_NUM <", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumLessThanOrEqualTo(Integer value) {
            addCriterion("LANGUAGE_NUM <=", value, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumIn(List<Integer> values) {
            addCriterion("LANGUAGE_NUM in", values, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumNotIn(List<Integer> values) {
            addCriterion("LANGUAGE_NUM not in", values, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumBetween(Integer value1, Integer value2) {
            addCriterion("LANGUAGE_NUM between", value1, value2, "languageNum");
            return (Criteria) this;
        }

        public Criteria andLanguageNumNotBetween(Integer value1, Integer value2) {
            addCriterion("LANGUAGE_NUM not between", value1, value2, "languageNum");
            return (Criteria) this;
        }

        public Criteria andPcNoticeIsNull() {
            addCriterion("PC_NOTICE is null");
            return (Criteria) this;
        }

        public Criteria andPcNoticeIsNotNull() {
            addCriterion("PC_NOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andPcNoticeEqualTo(String value) {
            addCriterion("PC_NOTICE =", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeNotEqualTo(String value) {
            addCriterion("PC_NOTICE <>", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeGreaterThan(String value) {
            addCriterion("PC_NOTICE >", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("PC_NOTICE >=", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeLessThan(String value) {
            addCriterion("PC_NOTICE <", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeLessThanOrEqualTo(String value) {
            addCriterion("PC_NOTICE <=", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeLike(String value) {
            addCriterion("PC_NOTICE like", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeNotLike(String value) {
            addCriterion("PC_NOTICE not like", value, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeIn(List<String> values) {
            addCriterion("PC_NOTICE in", values, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeNotIn(List<String> values) {
            addCriterion("PC_NOTICE not in", values, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeBetween(String value1, String value2) {
            addCriterion("PC_NOTICE between", value1, value2, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andPcNoticeNotBetween(String value1, String value2) {
            addCriterion("PC_NOTICE not between", value1, value2, "pcNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeIsNull() {
            addCriterion("WAP_NOTICE is null");
            return (Criteria) this;
        }

        public Criteria andWapNoticeIsNotNull() {
            addCriterion("WAP_NOTICE is not null");
            return (Criteria) this;
        }

        public Criteria andWapNoticeEqualTo(String value) {
            addCriterion("WAP_NOTICE =", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeNotEqualTo(String value) {
            addCriterion("WAP_NOTICE <>", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeGreaterThan(String value) {
            addCriterion("WAP_NOTICE >", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("WAP_NOTICE >=", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeLessThan(String value) {
            addCriterion("WAP_NOTICE <", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeLessThanOrEqualTo(String value) {
            addCriterion("WAP_NOTICE <=", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeLike(String value) {
            addCriterion("WAP_NOTICE like", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeNotLike(String value) {
            addCriterion("WAP_NOTICE not like", value, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeIn(List<String> values) {
            addCriterion("WAP_NOTICE in", values, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeNotIn(List<String> values) {
            addCriterion("WAP_NOTICE not in", values, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeBetween(String value1, String value2) {
            addCriterion("WAP_NOTICE between", value1, value2, "wapNotice");
            return (Criteria) this;
        }

        public Criteria andWapNoticeNotBetween(String value1, String value2) {
            addCriterion("WAP_NOTICE not between", value1, value2, "wapNotice");
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