package com.ai.platform.common.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class SysDuadCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SysDuadCriteria() {
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

        public Criteria andDuadIdIsNull() {
            addCriterion("duad_id is null");
            return (Criteria) this;
        }

        public Criteria andDuadIdIsNotNull() {
            addCriterion("duad_id is not null");
            return (Criteria) this;
        }

        public Criteria andDuadIdEqualTo(String value) {
            addCriterion("duad_id =", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdNotEqualTo(String value) {
            addCriterion("duad_id <>", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdGreaterThan(String value) {
            addCriterion("duad_id >", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdGreaterThanOrEqualTo(String value) {
            addCriterion("duad_id >=", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdLessThan(String value) {
            addCriterion("duad_id <", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdLessThanOrEqualTo(String value) {
            addCriterion("duad_id <=", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdLike(String value) {
            addCriterion("duad_id like", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdNotLike(String value) {
            addCriterion("duad_id not like", value, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdIn(List<String> values) {
            addCriterion("duad_id in", values, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdNotIn(List<String> values) {
            addCriterion("duad_id not in", values, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdBetween(String value1, String value2) {
            addCriterion("duad_id between", value1, value2, "duadId");
            return (Criteria) this;
        }

        public Criteria andDuadIdNotBetween(String value1, String value2) {
            addCriterion("duad_id not between", value1, value2, "duadId");
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

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageIsNull() {
            addCriterion("source_language is null");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageIsNotNull() {
            addCriterion("source_language is not null");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageEqualTo(String value) {
            addCriterion("source_language =", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageNotEqualTo(String value) {
            addCriterion("source_language <>", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageGreaterThan(String value) {
            addCriterion("source_language >", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("source_language >=", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageLessThan(String value) {
            addCriterion("source_language <", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageLessThanOrEqualTo(String value) {
            addCriterion("source_language <=", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageLike(String value) {
            addCriterion("source_language like", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageNotLike(String value) {
            addCriterion("source_language not like", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageIn(List<String> values) {
            addCriterion("source_language in", values, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageNotIn(List<String> values) {
            addCriterion("source_language not in", values, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageBetween(String value1, String value2) {
            addCriterion("source_language between", value1, value2, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageNotBetween(String value1, String value2) {
            addCriterion("source_language not between", value1, value2, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageIsNull() {
            addCriterion("target_language is null");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageIsNotNull() {
            addCriterion("target_language is not null");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageEqualTo(String value) {
            addCriterion("target_language =", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageNotEqualTo(String value) {
            addCriterion("target_language <>", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageGreaterThan(String value) {
            addCriterion("target_language >", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("target_language >=", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageLessThan(String value) {
            addCriterion("target_language <", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageLessThanOrEqualTo(String value) {
            addCriterion("target_language <=", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageLike(String value) {
            addCriterion("target_language like", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageNotLike(String value) {
            addCriterion("target_language not like", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageIn(List<String> values) {
            addCriterion("target_language in", values, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageNotIn(List<String> values) {
            addCriterion("target_language not in", values, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageBetween(String value1, String value2) {
            addCriterion("target_language between", value1, value2, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageNotBetween(String value1, String value2) {
            addCriterion("target_language not between", value1, value2, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andOrdinaryIsNull() {
            addCriterion("ordinary is null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryIsNotNull() {
            addCriterion("ordinary is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryEqualTo(String value) {
            addCriterion("ordinary =", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNotEqualTo(String value) {
            addCriterion("ordinary <>", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGreaterThan(String value) {
            addCriterion("ordinary >", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGreaterThanOrEqualTo(String value) {
            addCriterion("ordinary >=", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryLessThan(String value) {
            addCriterion("ordinary <", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryLessThanOrEqualTo(String value) {
            addCriterion("ordinary <=", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryLike(String value) {
            addCriterion("ordinary like", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNotLike(String value) {
            addCriterion("ordinary not like", value, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryIn(List<String> values) {
            addCriterion("ordinary in", values, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNotIn(List<String> values) {
            addCriterion("ordinary not in", values, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryBetween(String value1, String value2) {
            addCriterion("ordinary between", value1, value2, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryNotBetween(String value1, String value2) {
            addCriterion("ordinary not between", value1, value2, "ordinary");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentIsNull() {
            addCriterion("ordinary_urgent is null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentIsNotNull() {
            addCriterion("ordinary_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentEqualTo(String value) {
            addCriterion("ordinary_urgent =", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentNotEqualTo(String value) {
            addCriterion("ordinary_urgent <>", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentGreaterThan(String value) {
            addCriterion("ordinary_urgent >", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("ordinary_urgent >=", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentLessThan(String value) {
            addCriterion("ordinary_urgent <", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentLessThanOrEqualTo(String value) {
            addCriterion("ordinary_urgent <=", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentLike(String value) {
            addCriterion("ordinary_urgent like", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentNotLike(String value) {
            addCriterion("ordinary_urgent not like", value, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentIn(List<String> values) {
            addCriterion("ordinary_urgent in", values, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentNotIn(List<String> values) {
            addCriterion("ordinary_urgent not in", values, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentBetween(String value1, String value2) {
            addCriterion("ordinary_urgent between", value1, value2, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andOrdinaryUrgentNotBetween(String value1, String value2) {
            addCriterion("ordinary_urgent not between", value1, value2, "ordinaryUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("professional is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("professional is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("professional =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("professional <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("professional >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("professional >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("professional <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("professional <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("professional like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("professional not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("professional in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("professional not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("professional between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("professional not between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentIsNull() {
            addCriterion("professional_urgent is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentIsNotNull() {
            addCriterion("professional_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentEqualTo(String value) {
            addCriterion("professional_urgent =", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentNotEqualTo(String value) {
            addCriterion("professional_urgent <>", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentGreaterThan(String value) {
            addCriterion("professional_urgent >", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("professional_urgent >=", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentLessThan(String value) {
            addCriterion("professional_urgent <", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentLessThanOrEqualTo(String value) {
            addCriterion("professional_urgent <=", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentLike(String value) {
            addCriterion("professional_urgent like", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentNotLike(String value) {
            addCriterion("professional_urgent not like", value, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentIn(List<String> values) {
            addCriterion("professional_urgent in", values, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentNotIn(List<String> values) {
            addCriterion("professional_urgent not in", values, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentBetween(String value1, String value2) {
            addCriterion("professional_urgent between", value1, value2, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andProfessionalUrgentNotBetween(String value1, String value2) {
            addCriterion("professional_urgent not between", value1, value2, "professionalUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(String value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(String value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(String value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(String value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(String value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(String value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLike(String value) {
            addCriterion("publish like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotLike(String value) {
            addCriterion("publish not like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<String> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<String> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(String value1, String value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(String value1, String value2) {
            addCriterion("publish not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentIsNull() {
            addCriterion("publish_urgent is null");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentIsNotNull() {
            addCriterion("publish_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentEqualTo(String value) {
            addCriterion("publish_urgent =", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentNotEqualTo(String value) {
            addCriterion("publish_urgent <>", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentGreaterThan(String value) {
            addCriterion("publish_urgent >", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("publish_urgent >=", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentLessThan(String value) {
            addCriterion("publish_urgent <", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentLessThanOrEqualTo(String value) {
            addCriterion("publish_urgent <=", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentLike(String value) {
            addCriterion("publish_urgent like", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentNotLike(String value) {
            addCriterion("publish_urgent not like", value, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentIn(List<String> values) {
            addCriterion("publish_urgent in", values, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentNotIn(List<String> values) {
            addCriterion("publish_urgent not in", values, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentBetween(String value1, String value2) {
            addCriterion("publish_urgent between", value1, value2, "publishUrgent");
            return (Criteria) this;
        }

        public Criteria andPublishUrgentNotBetween(String value1, String value2) {
            addCriterion("publish_urgent not between", value1, value2, "publishUrgent");
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

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
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