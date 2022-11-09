package com.example.bugcheck.pojo.table;

import java.util.ArrayList;
import java.util.List;

public class DataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsIsNull() {
            addCriterion("ck_oo_numberOfPrivateMethods is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsIsNotNull() {
            addCriterion("ck_oo_numberOfPrivateMethods is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPrivateMethods =", value, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPrivateMethods <>", value, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfPrivateMethods >", value, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPrivateMethods >=", value, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsLessThan(Double value) {
            addCriterion("ck_oo_numberOfPrivateMethods <", value, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPrivateMethods <=", value, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsIn(List<Double> values) {
            addCriterion("ck_oo_numberOfPrivateMethods in", values, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfPrivateMethods not in", values, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfPrivateMethods between", value1, value2, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivatemethodsNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfPrivateMethods not between", value1, value2, "ckOoNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomIsNull() {
            addCriterion("LDHH_lcom is null");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomIsNotNull() {
            addCriterion("LDHH_lcom is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomEqualTo(Double value) {
            addCriterion("LDHH_lcom =", value, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomNotEqualTo(Double value) {
            addCriterion("LDHH_lcom <>", value, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomGreaterThan(Double value) {
            addCriterion("LDHH_lcom >", value, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_lcom >=", value, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomLessThan(Double value) {
            addCriterion("LDHH_lcom <", value, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_lcom <=", value, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomIn(List<Double> values) {
            addCriterion("LDHH_lcom in", values, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomNotIn(List<Double> values) {
            addCriterion("LDHH_lcom not in", values, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomBetween(Double value1, Double value2) {
            addCriterion("LDHH_lcom between", value1, value2, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhLcomNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_lcom not between", value1, value2, "ldhhLcom");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninIsNull() {
            addCriterion("LDHH_fanIn is null");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninIsNotNull() {
            addCriterion("LDHH_fanIn is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninEqualTo(Double value) {
            addCriterion("LDHH_fanIn =", value, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninNotEqualTo(Double value) {
            addCriterion("LDHH_fanIn <>", value, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninGreaterThan(Double value) {
            addCriterion("LDHH_fanIn >", value, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_fanIn >=", value, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninLessThan(Double value) {
            addCriterion("LDHH_fanIn <", value, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_fanIn <=", value, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninIn(List<Double> values) {
            addCriterion("LDHH_fanIn in", values, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninNotIn(List<Double> values) {
            addCriterion("LDHH_fanIn not in", values, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninBetween(Double value1, Double value2) {
            addCriterion("LDHH_fanIn between", value1, value2, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhFaninNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_fanIn not between", value1, value2, "ldhhFanin");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilIsNull() {
            addCriterion("numberOfNonTrivialBugsFoundUntil is null");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilIsNotNull() {
            addCriterion("numberOfNonTrivialBugsFoundUntil is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilEqualTo(Double value) {
            addCriterion("numberOfNonTrivialBugsFoundUntil =", value, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilNotEqualTo(Double value) {
            addCriterion("numberOfNonTrivialBugsFoundUntil <>", value, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilGreaterThan(Double value) {
            addCriterion("numberOfNonTrivialBugsFoundUntil >", value, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilGreaterThanOrEqualTo(Double value) {
            addCriterion("numberOfNonTrivialBugsFoundUntil >=", value, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilLessThan(Double value) {
            addCriterion("numberOfNonTrivialBugsFoundUntil <", value, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilLessThanOrEqualTo(Double value) {
            addCriterion("numberOfNonTrivialBugsFoundUntil <=", value, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilIn(List<Double> values) {
            addCriterion("numberOfNonTrivialBugsFoundUntil in", values, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilNotIn(List<Double> values) {
            addCriterion("numberOfNonTrivialBugsFoundUntil not in", values, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilBetween(Double value1, Double value2) {
            addCriterion("numberOfNonTrivialBugsFoundUntil between", value1, value2, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofnontrivialbugsfounduntilNotBetween(Double value1, Double value2) {
            addCriterion("numberOfNonTrivialBugsFoundUntil not between", value1, value2, "numberofnontrivialbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesIsNull() {
            addCriterion("WCHU_numberOfPublicAttributes is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesIsNotNull() {
            addCriterion("WCHU_numberOfPublicAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesEqualTo(Double value) {
            addCriterion("WCHU_numberOfPublicAttributes =", value, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfPublicAttributes <>", value, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesGreaterThan(Double value) {
            addCriterion("WCHU_numberOfPublicAttributes >", value, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfPublicAttributes >=", value, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesLessThan(Double value) {
            addCriterion("WCHU_numberOfPublicAttributes <", value, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfPublicAttributes <=", value, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesIn(List<Double> values) {
            addCriterion("WCHU_numberOfPublicAttributes in", values, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfPublicAttributes not in", values, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfPublicAttributes between", value1, value2, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicattributesNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfPublicAttributes not between", value1, value2, "wchuNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesIsNull() {
            addCriterion("WCHU_numberOfAttributes is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesIsNotNull() {
            addCriterion("WCHU_numberOfAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesEqualTo(Double value) {
            addCriterion("WCHU_numberOfAttributes =", value, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfAttributes <>", value, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesGreaterThan(Double value) {
            addCriterion("WCHU_numberOfAttributes >", value, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfAttributes >=", value, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesLessThan(Double value) {
            addCriterion("WCHU_numberOfAttributes <", value, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfAttributes <=", value, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesIn(List<Double> values) {
            addCriterion("WCHU_numberOfAttributes in", values, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfAttributes not in", values, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfAttributes between", value1, value2, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfAttributes not between", value1, value2, "wchuNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCvswentropyIsNull() {
            addCriterion("CvsWEntropy is null");
            return (Criteria) this;
        }

        public Criteria andCvswentropyIsNotNull() {
            addCriterion("CvsWEntropy is not null");
            return (Criteria) this;
        }

        public Criteria andCvswentropyEqualTo(Double value) {
            addCriterion("CvsWEntropy =", value, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyNotEqualTo(Double value) {
            addCriterion("CvsWEntropy <>", value, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyGreaterThan(Double value) {
            addCriterion("CvsWEntropy >", value, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyGreaterThanOrEqualTo(Double value) {
            addCriterion("CvsWEntropy >=", value, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyLessThan(Double value) {
            addCriterion("CvsWEntropy <", value, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyLessThanOrEqualTo(Double value) {
            addCriterion("CvsWEntropy <=", value, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyIn(List<Double> values) {
            addCriterion("CvsWEntropy in", values, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyNotIn(List<Double> values) {
            addCriterion("CvsWEntropy not in", values, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyBetween(Double value1, Double value2) {
            addCriterion("CvsWEntropy between", value1, value2, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andCvswentropyNotBetween(Double value1, Double value2) {
            addCriterion("CvsWEntropy not between", value1, value2, "cvswentropy");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsIsNull() {
            addCriterion("LDHH_numberOfPublicMethods is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsIsNotNull() {
            addCriterion("LDHH_numberOfPublicMethods is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsEqualTo(Double value) {
            addCriterion("LDHH_numberOfPublicMethods =", value, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfPublicMethods <>", value, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsGreaterThan(Double value) {
            addCriterion("LDHH_numberOfPublicMethods >", value, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfPublicMethods >=", value, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsLessThan(Double value) {
            addCriterion("LDHH_numberOfPublicMethods <", value, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfPublicMethods <=", value, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsIn(List<Double> values) {
            addCriterion("LDHH_numberOfPublicMethods in", values, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfPublicMethods not in", values, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfPublicMethods between", value1, value2, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicmethodsNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfPublicMethods not between", value1, value2, "ldhhNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuFaninIsNull() {
            addCriterion("WCHU_fanIn is null");
            return (Criteria) this;
        }

        public Criteria andWchuFaninIsNotNull() {
            addCriterion("WCHU_fanIn is not null");
            return (Criteria) this;
        }

        public Criteria andWchuFaninEqualTo(Double value) {
            addCriterion("WCHU_fanIn =", value, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninNotEqualTo(Double value) {
            addCriterion("WCHU_fanIn <>", value, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninGreaterThan(Double value) {
            addCriterion("WCHU_fanIn >", value, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_fanIn >=", value, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninLessThan(Double value) {
            addCriterion("WCHU_fanIn <", value, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_fanIn <=", value, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninIn(List<Double> values) {
            addCriterion("WCHU_fanIn in", values, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninNotIn(List<Double> values) {
            addCriterion("WCHU_fanIn not in", values, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninBetween(Double value1, Double value2) {
            addCriterion("WCHU_fanIn between", value1, value2, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andWchuFaninNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_fanIn not between", value1, value2, "wchuFanin");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesIsNull() {
            addCriterion("LDHH_numberOfPrivateAttributes is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesIsNotNull() {
            addCriterion("LDHH_numberOfPrivateAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesEqualTo(Double value) {
            addCriterion("LDHH_numberOfPrivateAttributes =", value, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfPrivateAttributes <>", value, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesGreaterThan(Double value) {
            addCriterion("LDHH_numberOfPrivateAttributes >", value, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfPrivateAttributes >=", value, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesLessThan(Double value) {
            addCriterion("LDHH_numberOfPrivateAttributes <", value, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfPrivateAttributes <=", value, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesIn(List<Double> values) {
            addCriterion("LDHH_numberOfPrivateAttributes in", values, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfPrivateAttributes not in", values, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfPrivateAttributes between", value1, value2, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivateattributesNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfPrivateAttributes not between", value1, value2, "ldhhNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCvsentropyIsNull() {
            addCriterion("CvsEntropy is null");
            return (Criteria) this;
        }

        public Criteria andCvsentropyIsNotNull() {
            addCriterion("CvsEntropy is not null");
            return (Criteria) this;
        }

        public Criteria andCvsentropyEqualTo(Double value) {
            addCriterion("CvsEntropy =", value, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyNotEqualTo(Double value) {
            addCriterion("CvsEntropy <>", value, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyGreaterThan(Double value) {
            addCriterion("CvsEntropy >", value, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyGreaterThanOrEqualTo(Double value) {
            addCriterion("CvsEntropy >=", value, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyLessThan(Double value) {
            addCriterion("CvsEntropy <", value, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyLessThanOrEqualTo(Double value) {
            addCriterion("CvsEntropy <=", value, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyIn(List<Double> values) {
            addCriterion("CvsEntropy in", values, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyNotIn(List<Double> values) {
            addCriterion("CvsEntropy not in", values, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyBetween(Double value1, Double value2) {
            addCriterion("CvsEntropy between", value1, value2, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andCvsentropyNotBetween(Double value1, Double value2) {
            addCriterion("CvsEntropy not between", value1, value2, "cvsentropy");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesIsNull() {
            addCriterion("LDHH_numberOfPublicAttributes is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesIsNotNull() {
            addCriterion("LDHH_numberOfPublicAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesEqualTo(Double value) {
            addCriterion("LDHH_numberOfPublicAttributes =", value, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfPublicAttributes <>", value, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesGreaterThan(Double value) {
            addCriterion("LDHH_numberOfPublicAttributes >", value, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfPublicAttributes >=", value, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesLessThan(Double value) {
            addCriterion("LDHH_numberOfPublicAttributes <", value, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfPublicAttributes <=", value, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesIn(List<Double> values) {
            addCriterion("LDHH_numberOfPublicAttributes in", values, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfPublicAttributes not in", values, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfPublicAttributes between", value1, value2, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofpublicattributesNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfPublicAttributes not between", value1, value2, "ldhhNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsIsNull() {
            addCriterion("WCHU_numberOfPrivateMethods is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsIsNotNull() {
            addCriterion("WCHU_numberOfPrivateMethods is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsEqualTo(Double value) {
            addCriterion("WCHU_numberOfPrivateMethods =", value, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfPrivateMethods <>", value, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsGreaterThan(Double value) {
            addCriterion("WCHU_numberOfPrivateMethods >", value, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfPrivateMethods >=", value, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsLessThan(Double value) {
            addCriterion("WCHU_numberOfPrivateMethods <", value, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfPrivateMethods <=", value, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsIn(List<Double> values) {
            addCriterion("WCHU_numberOfPrivateMethods in", values, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfPrivateMethods not in", values, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfPrivateMethods between", value1, value2, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivatemethodsNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfPrivateMethods not between", value1, value2, "wchuNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsIsNull() {
            addCriterion("WCHU_numberOfMethods is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsIsNotNull() {
            addCriterion("WCHU_numberOfMethods is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsEqualTo(Double value) {
            addCriterion("WCHU_numberOfMethods =", value, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfMethods <>", value, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsGreaterThan(Double value) {
            addCriterion("WCHU_numberOfMethods >", value, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfMethods >=", value, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsLessThan(Double value) {
            addCriterion("WCHU_numberOfMethods <", value, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfMethods <=", value, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsIn(List<Double> values) {
            addCriterion("WCHU_numberOfMethods in", values, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfMethods not in", values, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfMethods between", value1, value2, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfMethods not between", value1, value2, "wchuNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesIsNull() {
            addCriterion("ck_oo_numberOfPublicAttributes is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesIsNotNull() {
            addCriterion("ck_oo_numberOfPublicAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPublicAttributes =", value, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPublicAttributes <>", value, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfPublicAttributes >", value, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPublicAttributes >=", value, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesLessThan(Double value) {
            addCriterion("ck_oo_numberOfPublicAttributes <", value, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPublicAttributes <=", value, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesIn(List<Double> values) {
            addCriterion("ck_oo_numberOfPublicAttributes in", values, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfPublicAttributes not in", values, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfPublicAttributes between", value1, value2, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicattributesNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfPublicAttributes not between", value1, value2, "ckOoNumberofpublicattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNocIsNull() {
            addCriterion("ck_oo_noc is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNocIsNotNull() {
            addCriterion("ck_oo_noc is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNocEqualTo(Double value) {
            addCriterion("ck_oo_noc =", value, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocNotEqualTo(Double value) {
            addCriterion("ck_oo_noc <>", value, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocGreaterThan(Double value) {
            addCriterion("ck_oo_noc >", value, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_noc >=", value, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocLessThan(Double value) {
            addCriterion("ck_oo_noc <", value, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_noc <=", value, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocIn(List<Double> values) {
            addCriterion("ck_oo_noc in", values, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocNotIn(List<Double> values) {
            addCriterion("ck_oo_noc not in", values, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocBetween(Double value1, Double value2) {
            addCriterion("ck_oo_noc between", value1, value2, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNocNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_noc not between", value1, value2, "ckOoNoc");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilIsNull() {
            addCriterion("numberOfCriticalBugsFoundUntil is null");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilIsNotNull() {
            addCriterion("numberOfCriticalBugsFoundUntil is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilEqualTo(Double value) {
            addCriterion("numberOfCriticalBugsFoundUntil =", value, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilNotEqualTo(Double value) {
            addCriterion("numberOfCriticalBugsFoundUntil <>", value, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilGreaterThan(Double value) {
            addCriterion("numberOfCriticalBugsFoundUntil >", value, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilGreaterThanOrEqualTo(Double value) {
            addCriterion("numberOfCriticalBugsFoundUntil >=", value, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilLessThan(Double value) {
            addCriterion("numberOfCriticalBugsFoundUntil <", value, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilLessThanOrEqualTo(Double value) {
            addCriterion("numberOfCriticalBugsFoundUntil <=", value, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilIn(List<Double> values) {
            addCriterion("numberOfCriticalBugsFoundUntil in", values, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilNotIn(List<Double> values) {
            addCriterion("numberOfCriticalBugsFoundUntil not in", values, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilBetween(Double value1, Double value2) {
            addCriterion("numberOfCriticalBugsFoundUntil between", value1, value2, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofcriticalbugsfounduntilNotBetween(Double value1, Double value2) {
            addCriterion("numberOfCriticalBugsFoundUntil not between", value1, value2, "numberofcriticalbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcIsNull() {
            addCriterion("ck_oo_wmc is null");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcIsNotNull() {
            addCriterion("ck_oo_wmc is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcEqualTo(Double value) {
            addCriterion("ck_oo_wmc =", value, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcNotEqualTo(Double value) {
            addCriterion("ck_oo_wmc <>", value, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcGreaterThan(Double value) {
            addCriterion("ck_oo_wmc >", value, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_wmc >=", value, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcLessThan(Double value) {
            addCriterion("ck_oo_wmc <", value, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_wmc <=", value, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcIn(List<Double> values) {
            addCriterion("ck_oo_wmc in", values, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcNotIn(List<Double> values) {
            addCriterion("ck_oo_wmc not in", values, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcBetween(Double value1, Double value2) {
            addCriterion("ck_oo_wmc between", value1, value2, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andCkOoWmcNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_wmc not between", value1, value2, "ckOoWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsIsNull() {
            addCriterion("LDHH_numberOfPrivateMethods is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsIsNotNull() {
            addCriterion("LDHH_numberOfPrivateMethods is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsEqualTo(Double value) {
            addCriterion("LDHH_numberOfPrivateMethods =", value, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfPrivateMethods <>", value, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsGreaterThan(Double value) {
            addCriterion("LDHH_numberOfPrivateMethods >", value, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfPrivateMethods >=", value, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsLessThan(Double value) {
            addCriterion("LDHH_numberOfPrivateMethods <", value, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfPrivateMethods <=", value, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsIn(List<Double> values) {
            addCriterion("LDHH_numberOfPrivateMethods in", values, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfPrivateMethods not in", values, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfPrivateMethods between", value1, value2, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofprivatemethodsNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfPrivateMethods not between", value1, value2, "ldhhNumberofprivatemethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesIsNull() {
            addCriterion("WCHU_numberOfPrivateAttributes is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesIsNotNull() {
            addCriterion("WCHU_numberOfPrivateAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesEqualTo(Double value) {
            addCriterion("WCHU_numberOfPrivateAttributes =", value, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfPrivateAttributes <>", value, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesGreaterThan(Double value) {
            addCriterion("WCHU_numberOfPrivateAttributes >", value, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfPrivateAttributes >=", value, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesLessThan(Double value) {
            addCriterion("WCHU_numberOfPrivateAttributes <", value, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfPrivateAttributes <=", value, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesIn(List<Double> values) {
            addCriterion("WCHU_numberOfPrivateAttributes in", values, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfPrivateAttributes not in", values, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfPrivateAttributes between", value1, value2, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofprivateattributesNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfPrivateAttributes not between", value1, value2, "wchuNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andWchuNocIsNull() {
            addCriterion("WCHU_noc is null");
            return (Criteria) this;
        }

        public Criteria andWchuNocIsNotNull() {
            addCriterion("WCHU_noc is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNocEqualTo(Double value) {
            addCriterion("WCHU_noc =", value, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocNotEqualTo(Double value) {
            addCriterion("WCHU_noc <>", value, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocGreaterThan(Double value) {
            addCriterion("WCHU_noc >", value, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_noc >=", value, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocLessThan(Double value) {
            addCriterion("WCHU_noc <", value, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_noc <=", value, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocIn(List<Double> values) {
            addCriterion("WCHU_noc in", values, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocNotIn(List<Double> values) {
            addCriterion("WCHU_noc not in", values, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocBetween(Double value1, Double value2) {
            addCriterion("WCHU_noc between", value1, value2, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andWchuNocNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_noc not between", value1, value2, "wchuNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutIsNull() {
            addCriterion("ck_oo_fanOut is null");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutIsNotNull() {
            addCriterion("ck_oo_fanOut is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutEqualTo(Double value) {
            addCriterion("ck_oo_fanOut =", value, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutNotEqualTo(Double value) {
            addCriterion("ck_oo_fanOut <>", value, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutGreaterThan(Double value) {
            addCriterion("ck_oo_fanOut >", value, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_fanOut >=", value, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutLessThan(Double value) {
            addCriterion("ck_oo_fanOut <", value, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_fanOut <=", value, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutIn(List<Double> values) {
            addCriterion("ck_oo_fanOut in", values, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutNotIn(List<Double> values) {
            addCriterion("ck_oo_fanOut not in", values, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutBetween(Double value1, Double value2) {
            addCriterion("ck_oo_fanOut between", value1, value2, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCkOoFanoutNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_fanOut not between", value1, value2, "ckOoFanout");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyIsNull() {
            addCriterion("CvsLogEntropy is null");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyIsNotNull() {
            addCriterion("CvsLogEntropy is not null");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyEqualTo(Double value) {
            addCriterion("CvsLogEntropy =", value, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyNotEqualTo(Double value) {
            addCriterion("CvsLogEntropy <>", value, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyGreaterThan(Double value) {
            addCriterion("CvsLogEntropy >", value, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyGreaterThanOrEqualTo(Double value) {
            addCriterion("CvsLogEntropy >=", value, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyLessThan(Double value) {
            addCriterion("CvsLogEntropy <", value, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyLessThanOrEqualTo(Double value) {
            addCriterion("CvsLogEntropy <=", value, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyIn(List<Double> values) {
            addCriterion("CvsLogEntropy in", values, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyNotIn(List<Double> values) {
            addCriterion("CvsLogEntropy not in", values, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyBetween(Double value1, Double value2) {
            addCriterion("CvsLogEntropy between", value1, value2, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andCvslogentropyNotBetween(Double value1, Double value2) {
            addCriterion("CvsLogEntropy not between", value1, value2, "cvslogentropy");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedIsNull() {
            addCriterion("LDHH_numberOfAttributesInherited is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedIsNotNull() {
            addCriterion("LDHH_numberOfAttributesInherited is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedEqualTo(Double value) {
            addCriterion("LDHH_numberOfAttributesInherited =", value, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfAttributesInherited <>", value, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedGreaterThan(Double value) {
            addCriterion("LDHH_numberOfAttributesInherited >", value, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfAttributesInherited >=", value, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedLessThan(Double value) {
            addCriterion("LDHH_numberOfAttributesInherited <", value, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfAttributesInherited <=", value, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedIn(List<Double> values) {
            addCriterion("LDHH_numberOfAttributesInherited in", values, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfAttributesInherited not in", values, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfAttributesInherited between", value1, value2, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesinheritedNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfAttributesInherited not between", value1, value2, "ldhhNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeIsNull() {
            addCriterion("ck_oo_numberOfLinesOfCode is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeIsNotNull() {
            addCriterion("ck_oo_numberOfLinesOfCode is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeEqualTo(Double value) {
            addCriterion("ck_oo_numberOfLinesOfCode =", value, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfLinesOfCode <>", value, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfLinesOfCode >", value, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfLinesOfCode >=", value, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeLessThan(Double value) {
            addCriterion("ck_oo_numberOfLinesOfCode <", value, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfLinesOfCode <=", value, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeIn(List<Double> values) {
            addCriterion("ck_oo_numberOfLinesOfCode in", values, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfLinesOfCode not in", values, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfLinesOfCode between", value1, value2, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberoflinesofcodeNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfLinesOfCode not between", value1, value2, "ckOoNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCkOoDitIsNull() {
            addCriterion("ck_oo_dit is null");
            return (Criteria) this;
        }

        public Criteria andCkOoDitIsNotNull() {
            addCriterion("ck_oo_dit is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoDitEqualTo(Double value) {
            addCriterion("ck_oo_dit =", value, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitNotEqualTo(Double value) {
            addCriterion("ck_oo_dit <>", value, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitGreaterThan(Double value) {
            addCriterion("ck_oo_dit >", value, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_dit >=", value, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitLessThan(Double value) {
            addCriterion("ck_oo_dit <", value, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_dit <=", value, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitIn(List<Double> values) {
            addCriterion("ck_oo_dit in", values, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitNotIn(List<Double> values) {
            addCriterion("ck_oo_dit not in", values, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitBetween(Double value1, Double value2) {
            addCriterion("ck_oo_dit between", value1, value2, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andCkOoDitNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_dit not between", value1, value2, "ckOoDit");
            return (Criteria) this;
        }

        public Criteria andWchuWmcIsNull() {
            addCriterion("WCHU_wmc is null");
            return (Criteria) this;
        }

        public Criteria andWchuWmcIsNotNull() {
            addCriterion("WCHU_wmc is not null");
            return (Criteria) this;
        }

        public Criteria andWchuWmcEqualTo(Double value) {
            addCriterion("WCHU_wmc =", value, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcNotEqualTo(Double value) {
            addCriterion("WCHU_wmc <>", value, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcGreaterThan(Double value) {
            addCriterion("WCHU_wmc >", value, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_wmc >=", value, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcLessThan(Double value) {
            addCriterion("WCHU_wmc <", value, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_wmc <=", value, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcIn(List<Double> values) {
            addCriterion("WCHU_wmc in", values, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcNotIn(List<Double> values) {
            addCriterion("WCHU_wmc not in", values, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcBetween(Double value1, Double value2) {
            addCriterion("WCHU_wmc between", value1, value2, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andWchuWmcNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_wmc not between", value1, value2, "wchuWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocIsNull() {
            addCriterion("LDHH_noc is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNocIsNotNull() {
            addCriterion("LDHH_noc is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNocEqualTo(Double value) {
            addCriterion("LDHH_noc =", value, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocNotEqualTo(Double value) {
            addCriterion("LDHH_noc <>", value, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocGreaterThan(Double value) {
            addCriterion("LDHH_noc >", value, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_noc >=", value, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocLessThan(Double value) {
            addCriterion("LDHH_noc <", value, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_noc <=", value, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocIn(List<Double> values) {
            addCriterion("LDHH_noc in", values, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocNotIn(List<Double> values) {
            addCriterion("LDHH_noc not in", values, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocBetween(Double value1, Double value2) {
            addCriterion("LDHH_noc between", value1, value2, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andLdhhNocNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_noc not between", value1, value2, "ldhhNoc");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsIsNull() {
            addCriterion("ck_oo_numberOfMethods is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsIsNotNull() {
            addCriterion("ck_oo_numberOfMethods is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsEqualTo(Double value) {
            addCriterion("ck_oo_numberOfMethods =", value, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfMethods <>", value, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfMethods >", value, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfMethods >=", value, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsLessThan(Double value) {
            addCriterion("ck_oo_numberOfMethods <", value, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfMethods <=", value, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsIn(List<Double> values) {
            addCriterion("ck_oo_numberOfMethods in", values, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfMethods not in", values, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfMethods between", value1, value2, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfMethods not between", value1, value2, "ckOoNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedIsNull() {
            addCriterion("ck_oo_numberOfAttributesInherited is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedIsNotNull() {
            addCriterion("ck_oo_numberOfAttributesInherited is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedEqualTo(Double value) {
            addCriterion("ck_oo_numberOfAttributesInherited =", value, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfAttributesInherited <>", value, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfAttributesInherited >", value, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfAttributesInherited >=", value, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedLessThan(Double value) {
            addCriterion("ck_oo_numberOfAttributesInherited <", value, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfAttributesInherited <=", value, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedIn(List<Double> values) {
            addCriterion("ck_oo_numberOfAttributesInherited in", values, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfAttributesInherited not in", values, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfAttributesInherited between", value1, value2, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesinheritedNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfAttributesInherited not between", value1, value2, "ckOoNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuDitIsNull() {
            addCriterion("WCHU_dit is null");
            return (Criteria) this;
        }

        public Criteria andWchuDitIsNotNull() {
            addCriterion("WCHU_dit is not null");
            return (Criteria) this;
        }

        public Criteria andWchuDitEqualTo(Double value) {
            addCriterion("WCHU_dit =", value, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitNotEqualTo(Double value) {
            addCriterion("WCHU_dit <>", value, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitGreaterThan(Double value) {
            addCriterion("WCHU_dit >", value, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_dit >=", value, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitLessThan(Double value) {
            addCriterion("WCHU_dit <", value, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_dit <=", value, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitIn(List<Double> values) {
            addCriterion("WCHU_dit in", values, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitNotIn(List<Double> values) {
            addCriterion("WCHU_dit not in", values, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitBetween(Double value1, Double value2) {
            addCriterion("WCHU_dit between", value1, value2, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andWchuDitNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_dit not between", value1, value2, "wchuDit");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomIsNull() {
            addCriterion("ck_oo_lcom is null");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomIsNotNull() {
            addCriterion("ck_oo_lcom is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomEqualTo(Double value) {
            addCriterion("ck_oo_lcom =", value, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomNotEqualTo(Double value) {
            addCriterion("ck_oo_lcom <>", value, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomGreaterThan(Double value) {
            addCriterion("ck_oo_lcom >", value, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_lcom >=", value, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomLessThan(Double value) {
            addCriterion("ck_oo_lcom <", value, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_lcom <=", value, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomIn(List<Double> values) {
            addCriterion("ck_oo_lcom in", values, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomNotIn(List<Double> values) {
            addCriterion("ck_oo_lcom not in", values, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomBetween(Double value1, Double value2) {
            addCriterion("ck_oo_lcom between", value1, value2, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoLcomNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_lcom not between", value1, value2, "ckOoLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninIsNull() {
            addCriterion("ck_oo_fanIn is null");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninIsNotNull() {
            addCriterion("ck_oo_fanIn is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninEqualTo(Double value) {
            addCriterion("ck_oo_fanIn =", value, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninNotEqualTo(Double value) {
            addCriterion("ck_oo_fanIn <>", value, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninGreaterThan(Double value) {
            addCriterion("ck_oo_fanIn >", value, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_fanIn >=", value, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninLessThan(Double value) {
            addCriterion("ck_oo_fanIn <", value, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_fanIn <=", value, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninIn(List<Double> values) {
            addCriterion("ck_oo_fanIn in", values, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninNotIn(List<Double> values) {
            addCriterion("ck_oo_fanIn not in", values, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninBetween(Double value1, Double value2) {
            addCriterion("ck_oo_fanIn between", value1, value2, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andCkOoFaninNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_fanIn not between", value1, value2, "ckOoFanin");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedIsNull() {
            addCriterion("WCHU_numberOfAttributesInherited is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedIsNotNull() {
            addCriterion("WCHU_numberOfAttributesInherited is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedEqualTo(Double value) {
            addCriterion("WCHU_numberOfAttributesInherited =", value, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfAttributesInherited <>", value, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedGreaterThan(Double value) {
            addCriterion("WCHU_numberOfAttributesInherited >", value, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfAttributesInherited >=", value, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedLessThan(Double value) {
            addCriterion("WCHU_numberOfAttributesInherited <", value, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfAttributesInherited <=", value, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedIn(List<Double> values) {
            addCriterion("WCHU_numberOfAttributesInherited in", values, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfAttributesInherited not in", values, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfAttributesInherited between", value1, value2, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofattributesinheritedNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfAttributesInherited not between", value1, value2, "wchuNumberofattributesinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcIsNull() {
            addCriterion("ck_oo_rfc is null");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcIsNotNull() {
            addCriterion("ck_oo_rfc is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcEqualTo(Double value) {
            addCriterion("ck_oo_rfc =", value, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcNotEqualTo(Double value) {
            addCriterion("ck_oo_rfc <>", value, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcGreaterThan(Double value) {
            addCriterion("ck_oo_rfc >", value, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_rfc >=", value, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcLessThan(Double value) {
            addCriterion("ck_oo_rfc <", value, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_rfc <=", value, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcIn(List<Double> values) {
            addCriterion("ck_oo_rfc in", values, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcNotIn(List<Double> values) {
            addCriterion("ck_oo_rfc not in", values, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcBetween(Double value1, Double value2) {
            addCriterion("ck_oo_rfc between", value1, value2, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoRfcNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_rfc not between", value1, value2, "ckOoRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcIsNull() {
            addCriterion("LDHH_wmc is null");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcIsNotNull() {
            addCriterion("LDHH_wmc is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcEqualTo(Double value) {
            addCriterion("LDHH_wmc =", value, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcNotEqualTo(Double value) {
            addCriterion("LDHH_wmc <>", value, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcGreaterThan(Double value) {
            addCriterion("LDHH_wmc >", value, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_wmc >=", value, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcLessThan(Double value) {
            addCriterion("LDHH_wmc <", value, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_wmc <=", value, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcIn(List<Double> values) {
            addCriterion("LDHH_wmc in", values, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcNotIn(List<Double> values) {
            addCriterion("LDHH_wmc not in", values, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcBetween(Double value1, Double value2) {
            addCriterion("LDHH_wmc between", value1, value2, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhWmcNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_wmc not between", value1, value2, "ldhhWmc");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesIsNull() {
            addCriterion("LDHH_numberOfAttributes is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesIsNotNull() {
            addCriterion("LDHH_numberOfAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesEqualTo(Double value) {
            addCriterion("LDHH_numberOfAttributes =", value, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfAttributes <>", value, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesGreaterThan(Double value) {
            addCriterion("LDHH_numberOfAttributes >", value, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfAttributes >=", value, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesLessThan(Double value) {
            addCriterion("LDHH_numberOfAttributes <", value, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfAttributes <=", value, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesIn(List<Double> values) {
            addCriterion("LDHH_numberOfAttributes in", values, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfAttributes not in", values, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfAttributes between", value1, value2, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofattributesNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfAttributes not between", value1, value2, "ldhhNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeIsNull() {
            addCriterion("LDHH_numberOfLinesOfCode is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeIsNotNull() {
            addCriterion("LDHH_numberOfLinesOfCode is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeEqualTo(Double value) {
            addCriterion("LDHH_numberOfLinesOfCode =", value, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfLinesOfCode <>", value, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeGreaterThan(Double value) {
            addCriterion("LDHH_numberOfLinesOfCode >", value, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfLinesOfCode >=", value, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeLessThan(Double value) {
            addCriterion("LDHH_numberOfLinesOfCode <", value, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfLinesOfCode <=", value, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeIn(List<Double> values) {
            addCriterion("LDHH_numberOfLinesOfCode in", values, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfLinesOfCode not in", values, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfLinesOfCode between", value1, value2, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberoflinesofcodeNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfLinesOfCode not between", value1, value2, "ldhhNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutIsNull() {
            addCriterion("WCHU_fanOut is null");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutIsNotNull() {
            addCriterion("WCHU_fanOut is not null");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutEqualTo(Double value) {
            addCriterion("WCHU_fanOut =", value, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutNotEqualTo(Double value) {
            addCriterion("WCHU_fanOut <>", value, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutGreaterThan(Double value) {
            addCriterion("WCHU_fanOut >", value, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_fanOut >=", value, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutLessThan(Double value) {
            addCriterion("WCHU_fanOut <", value, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_fanOut <=", value, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutIn(List<Double> values) {
            addCriterion("WCHU_fanOut in", values, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutNotIn(List<Double> values) {
            addCriterion("WCHU_fanOut not in", values, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutBetween(Double value1, Double value2) {
            addCriterion("WCHU_fanOut between", value1, value2, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuFanoutNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_fanOut not between", value1, value2, "wchuFanout");
            return (Criteria) this;
        }

        public Criteria andWchuLcomIsNull() {
            addCriterion("WCHU_lcom is null");
            return (Criteria) this;
        }

        public Criteria andWchuLcomIsNotNull() {
            addCriterion("WCHU_lcom is not null");
            return (Criteria) this;
        }

        public Criteria andWchuLcomEqualTo(Double value) {
            addCriterion("WCHU_lcom =", value, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomNotEqualTo(Double value) {
            addCriterion("WCHU_lcom <>", value, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomGreaterThan(Double value) {
            addCriterion("WCHU_lcom >", value, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_lcom >=", value, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomLessThan(Double value) {
            addCriterion("WCHU_lcom <", value, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_lcom <=", value, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomIn(List<Double> values) {
            addCriterion("WCHU_lcom in", values, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomNotIn(List<Double> values) {
            addCriterion("WCHU_lcom not in", values, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomBetween(Double value1, Double value2) {
            addCriterion("WCHU_lcom between", value1, value2, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andWchuLcomNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_lcom not between", value1, value2, "wchuLcom");
            return (Criteria) this;
        }

        public Criteria andCkOoCboIsNull() {
            addCriterion("ck_oo_cbo is null");
            return (Criteria) this;
        }

        public Criteria andCkOoCboIsNotNull() {
            addCriterion("ck_oo_cbo is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoCboEqualTo(Double value) {
            addCriterion("ck_oo_cbo =", value, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboNotEqualTo(Double value) {
            addCriterion("ck_oo_cbo <>", value, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboGreaterThan(Double value) {
            addCriterion("ck_oo_cbo >", value, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_cbo >=", value, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboLessThan(Double value) {
            addCriterion("ck_oo_cbo <", value, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_cbo <=", value, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboIn(List<Double> values) {
            addCriterion("ck_oo_cbo in", values, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboNotIn(List<Double> values) {
            addCriterion("ck_oo_cbo not in", values, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboBetween(Double value1, Double value2) {
            addCriterion("ck_oo_cbo between", value1, value2, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andCkOoCboNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_cbo not between", value1, value2, "ckOoCbo");
            return (Criteria) this;
        }

        public Criteria andWchuRfcIsNull() {
            addCriterion("WCHU_rfc is null");
            return (Criteria) this;
        }

        public Criteria andWchuRfcIsNotNull() {
            addCriterion("WCHU_rfc is not null");
            return (Criteria) this;
        }

        public Criteria andWchuRfcEqualTo(Double value) {
            addCriterion("WCHU_rfc =", value, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcNotEqualTo(Double value) {
            addCriterion("WCHU_rfc <>", value, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcGreaterThan(Double value) {
            addCriterion("WCHU_rfc >", value, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_rfc >=", value, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcLessThan(Double value) {
            addCriterion("WCHU_rfc <", value, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_rfc <=", value, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcIn(List<Double> values) {
            addCriterion("WCHU_rfc in", values, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcNotIn(List<Double> values) {
            addCriterion("WCHU_rfc not in", values, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcBetween(Double value1, Double value2) {
            addCriterion("WCHU_rfc between", value1, value2, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andWchuRfcNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_rfc not between", value1, value2, "wchuRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesIsNull() {
            addCriterion("ck_oo_numberOfAttributes is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesIsNotNull() {
            addCriterion("ck_oo_numberOfAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesEqualTo(Double value) {
            addCriterion("ck_oo_numberOfAttributes =", value, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfAttributes <>", value, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfAttributes >", value, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfAttributes >=", value, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesLessThan(Double value) {
            addCriterion("ck_oo_numberOfAttributes <", value, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfAttributes <=", value, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesIn(List<Double> values) {
            addCriterion("ck_oo_numberOfAttributes in", values, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfAttributes not in", values, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfAttributes between", value1, value2, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofattributesNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfAttributes not between", value1, value2, "ckOoNumberofattributes");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilIsNull() {
            addCriterion("numberOfHighPriorityBugsFoundUntil is null");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilIsNotNull() {
            addCriterion("numberOfHighPriorityBugsFoundUntil is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilEqualTo(Double value) {
            addCriterion("numberOfHighPriorityBugsFoundUntil =", value, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilNotEqualTo(Double value) {
            addCriterion("numberOfHighPriorityBugsFoundUntil <>", value, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilGreaterThan(Double value) {
            addCriterion("numberOfHighPriorityBugsFoundUntil >", value, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilGreaterThanOrEqualTo(Double value) {
            addCriterion("numberOfHighPriorityBugsFoundUntil >=", value, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilLessThan(Double value) {
            addCriterion("numberOfHighPriorityBugsFoundUntil <", value, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilLessThanOrEqualTo(Double value) {
            addCriterion("numberOfHighPriorityBugsFoundUntil <=", value, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilIn(List<Double> values) {
            addCriterion("numberOfHighPriorityBugsFoundUntil in", values, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilNotIn(List<Double> values) {
            addCriterion("numberOfHighPriorityBugsFoundUntil not in", values, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilBetween(Double value1, Double value2) {
            addCriterion("numberOfHighPriorityBugsFoundUntil between", value1, value2, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofhighprioritybugsfounduntilNotBetween(Double value1, Double value2) {
            addCriterion("numberOfHighPriorityBugsFoundUntil not between", value1, value2, "numberofhighprioritybugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesIsNull() {
            addCriterion("ck_oo_numberOfPrivateAttributes is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesIsNotNull() {
            addCriterion("ck_oo_numberOfPrivateAttributes is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPrivateAttributes =", value, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPrivateAttributes <>", value, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfPrivateAttributes >", value, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPrivateAttributes >=", value, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesLessThan(Double value) {
            addCriterion("ck_oo_numberOfPrivateAttributes <", value, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPrivateAttributes <=", value, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesIn(List<Double> values) {
            addCriterion("ck_oo_numberOfPrivateAttributes in", values, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfPrivateAttributes not in", values, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfPrivateAttributes between", value1, value2, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofprivateattributesNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfPrivateAttributes not between", value1, value2, "ckOoNumberofprivateattributes");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilIsNull() {
            addCriterion("numberOfMajorBugsFoundUntil is null");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilIsNotNull() {
            addCriterion("numberOfMajorBugsFoundUntil is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilEqualTo(Double value) {
            addCriterion("numberOfMajorBugsFoundUntil =", value, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilNotEqualTo(Double value) {
            addCriterion("numberOfMajorBugsFoundUntil <>", value, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilGreaterThan(Double value) {
            addCriterion("numberOfMajorBugsFoundUntil >", value, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilGreaterThanOrEqualTo(Double value) {
            addCriterion("numberOfMajorBugsFoundUntil >=", value, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilLessThan(Double value) {
            addCriterion("numberOfMajorBugsFoundUntil <", value, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilLessThanOrEqualTo(Double value) {
            addCriterion("numberOfMajorBugsFoundUntil <=", value, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilIn(List<Double> values) {
            addCriterion("numberOfMajorBugsFoundUntil in", values, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilNotIn(List<Double> values) {
            addCriterion("numberOfMajorBugsFoundUntil not in", values, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilBetween(Double value1, Double value2) {
            addCriterion("numberOfMajorBugsFoundUntil between", value1, value2, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofmajorbugsfounduntilNotBetween(Double value1, Double value2) {
            addCriterion("numberOfMajorBugsFoundUntil not between", value1, value2, "numberofmajorbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsIsNull() {
            addCriterion("WCHU_numberOfPublicMethods is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsIsNotNull() {
            addCriterion("WCHU_numberOfPublicMethods is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsEqualTo(Double value) {
            addCriterion("WCHU_numberOfPublicMethods =", value, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfPublicMethods <>", value, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsGreaterThan(Double value) {
            addCriterion("WCHU_numberOfPublicMethods >", value, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfPublicMethods >=", value, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsLessThan(Double value) {
            addCriterion("WCHU_numberOfPublicMethods <", value, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfPublicMethods <=", value, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsIn(List<Double> values) {
            addCriterion("WCHU_numberOfPublicMethods in", values, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfPublicMethods not in", values, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfPublicMethods between", value1, value2, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofpublicmethodsNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfPublicMethods not between", value1, value2, "wchuNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhDitIsNull() {
            addCriterion("LDHH_dit is null");
            return (Criteria) this;
        }

        public Criteria andLdhhDitIsNotNull() {
            addCriterion("LDHH_dit is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhDitEqualTo(Double value) {
            addCriterion("LDHH_dit =", value, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitNotEqualTo(Double value) {
            addCriterion("LDHH_dit <>", value, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitGreaterThan(Double value) {
            addCriterion("LDHH_dit >", value, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_dit >=", value, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitLessThan(Double value) {
            addCriterion("LDHH_dit <", value, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_dit <=", value, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitIn(List<Double> values) {
            addCriterion("LDHH_dit in", values, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitNotIn(List<Double> values) {
            addCriterion("LDHH_dit not in", values, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitBetween(Double value1, Double value2) {
            addCriterion("LDHH_dit between", value1, value2, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andLdhhDitNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_dit not between", value1, value2, "ldhhDit");
            return (Criteria) this;
        }

        public Criteria andWchuCboIsNull() {
            addCriterion("WCHU_cbo is null");
            return (Criteria) this;
        }

        public Criteria andWchuCboIsNotNull() {
            addCriterion("WCHU_cbo is not null");
            return (Criteria) this;
        }

        public Criteria andWchuCboEqualTo(Double value) {
            addCriterion("WCHU_cbo =", value, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboNotEqualTo(Double value) {
            addCriterion("WCHU_cbo <>", value, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboGreaterThan(Double value) {
            addCriterion("WCHU_cbo >", value, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_cbo >=", value, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboLessThan(Double value) {
            addCriterion("WCHU_cbo <", value, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_cbo <=", value, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboIn(List<Double> values) {
            addCriterion("WCHU_cbo in", values, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboNotIn(List<Double> values) {
            addCriterion("WCHU_cbo not in", values, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboBetween(Double value1, Double value2) {
            addCriterion("WCHU_cbo between", value1, value2, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andWchuCboNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_cbo not between", value1, value2, "wchuCbo");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyIsNull() {
            addCriterion("CvsLinEntropy is null");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyIsNotNull() {
            addCriterion("CvsLinEntropy is not null");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyEqualTo(Double value) {
            addCriterion("CvsLinEntropy =", value, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyNotEqualTo(Double value) {
            addCriterion("CvsLinEntropy <>", value, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyGreaterThan(Double value) {
            addCriterion("CvsLinEntropy >", value, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyGreaterThanOrEqualTo(Double value) {
            addCriterion("CvsLinEntropy >=", value, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyLessThan(Double value) {
            addCriterion("CvsLinEntropy <", value, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyLessThanOrEqualTo(Double value) {
            addCriterion("CvsLinEntropy <=", value, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyIn(List<Double> values) {
            addCriterion("CvsLinEntropy in", values, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyNotIn(List<Double> values) {
            addCriterion("CvsLinEntropy not in", values, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyBetween(Double value1, Double value2) {
            addCriterion("CvsLinEntropy between", value1, value2, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andCvslinentropyNotBetween(Double value1, Double value2) {
            addCriterion("CvsLinEntropy not between", value1, value2, "cvslinentropy");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedIsNull() {
            addCriterion("WCHU_numberOfMethodsInherited is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedIsNotNull() {
            addCriterion("WCHU_numberOfMethodsInherited is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedEqualTo(Double value) {
            addCriterion("WCHU_numberOfMethodsInherited =", value, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfMethodsInherited <>", value, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedGreaterThan(Double value) {
            addCriterion("WCHU_numberOfMethodsInherited >", value, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfMethodsInherited >=", value, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedLessThan(Double value) {
            addCriterion("WCHU_numberOfMethodsInherited <", value, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfMethodsInherited <=", value, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedIn(List<Double> values) {
            addCriterion("WCHU_numberOfMethodsInherited in", values, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfMethodsInherited not in", values, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfMethodsInherited between", value1, value2, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andWchuNumberofmethodsinheritedNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfMethodsInherited not between", value1, value2, "wchuNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilIsNull() {
            addCriterion("numberOfBugsFoundUntil is null");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilIsNotNull() {
            addCriterion("numberOfBugsFoundUntil is not null");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilEqualTo(Double value) {
            addCriterion("numberOfBugsFoundUntil =", value, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilNotEqualTo(Double value) {
            addCriterion("numberOfBugsFoundUntil <>", value, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilGreaterThan(Double value) {
            addCriterion("numberOfBugsFoundUntil >", value, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilGreaterThanOrEqualTo(Double value) {
            addCriterion("numberOfBugsFoundUntil >=", value, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilLessThan(Double value) {
            addCriterion("numberOfBugsFoundUntil <", value, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilLessThanOrEqualTo(Double value) {
            addCriterion("numberOfBugsFoundUntil <=", value, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilIn(List<Double> values) {
            addCriterion("numberOfBugsFoundUntil in", values, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilNotIn(List<Double> values) {
            addCriterion("numberOfBugsFoundUntil not in", values, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilBetween(Double value1, Double value2) {
            addCriterion("numberOfBugsFoundUntil between", value1, value2, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andNumberofbugsfounduntilNotBetween(Double value1, Double value2) {
            addCriterion("numberOfBugsFoundUntil not between", value1, value2, "numberofbugsfounduntil");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutIsNull() {
            addCriterion("LDHH_fanOut is null");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutIsNotNull() {
            addCriterion("LDHH_fanOut is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutEqualTo(Double value) {
            addCriterion("LDHH_fanOut =", value, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutNotEqualTo(Double value) {
            addCriterion("LDHH_fanOut <>", value, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutGreaterThan(Double value) {
            addCriterion("LDHH_fanOut >", value, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_fanOut >=", value, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutLessThan(Double value) {
            addCriterion("LDHH_fanOut <", value, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_fanOut <=", value, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutIn(List<Double> values) {
            addCriterion("LDHH_fanOut in", values, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutNotIn(List<Double> values) {
            addCriterion("LDHH_fanOut not in", values, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutBetween(Double value1, Double value2) {
            addCriterion("LDHH_fanOut between", value1, value2, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhFanoutNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_fanOut not between", value1, value2, "ldhhFanout");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedIsNull() {
            addCriterion("LDHH_numberOfMethodsInherited is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedIsNotNull() {
            addCriterion("LDHH_numberOfMethodsInherited is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedEqualTo(Double value) {
            addCriterion("LDHH_numberOfMethodsInherited =", value, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfMethodsInherited <>", value, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedGreaterThan(Double value) {
            addCriterion("LDHH_numberOfMethodsInherited >", value, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfMethodsInherited >=", value, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedLessThan(Double value) {
            addCriterion("LDHH_numberOfMethodsInherited <", value, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfMethodsInherited <=", value, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedIn(List<Double> values) {
            addCriterion("LDHH_numberOfMethodsInherited in", values, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfMethodsInherited not in", values, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfMethodsInherited between", value1, value2, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsinheritedNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfMethodsInherited not between", value1, value2, "ldhhNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcIsNull() {
            addCriterion("LDHH_rfc is null");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcIsNotNull() {
            addCriterion("LDHH_rfc is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcEqualTo(Double value) {
            addCriterion("LDHH_rfc =", value, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcNotEqualTo(Double value) {
            addCriterion("LDHH_rfc <>", value, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcGreaterThan(Double value) {
            addCriterion("LDHH_rfc >", value, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_rfc >=", value, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcLessThan(Double value) {
            addCriterion("LDHH_rfc <", value, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_rfc <=", value, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcIn(List<Double> values) {
            addCriterion("LDHH_rfc in", values, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcNotIn(List<Double> values) {
            addCriterion("LDHH_rfc not in", values, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcBetween(Double value1, Double value2) {
            addCriterion("LDHH_rfc between", value1, value2, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andLdhhRfcNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_rfc not between", value1, value2, "ldhhRfc");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedIsNull() {
            addCriterion("ck_oo_numberOfMethodsInherited is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedIsNotNull() {
            addCriterion("ck_oo_numberOfMethodsInherited is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedEqualTo(Double value) {
            addCriterion("ck_oo_numberOfMethodsInherited =", value, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfMethodsInherited <>", value, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfMethodsInherited >", value, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfMethodsInherited >=", value, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedLessThan(Double value) {
            addCriterion("ck_oo_numberOfMethodsInherited <", value, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfMethodsInherited <=", value, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedIn(List<Double> values) {
            addCriterion("ck_oo_numberOfMethodsInherited in", values, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfMethodsInherited not in", values, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfMethodsInherited between", value1, value2, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofmethodsinheritedNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfMethodsInherited not between", value1, value2, "ckOoNumberofmethodsinherited");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsIsNull() {
            addCriterion("ck_oo_numberOfPublicMethods is null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsIsNotNull() {
            addCriterion("ck_oo_numberOfPublicMethods is not null");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPublicMethods =", value, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsNotEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPublicMethods <>", value, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsGreaterThan(Double value) {
            addCriterion("ck_oo_numberOfPublicMethods >", value, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPublicMethods >=", value, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsLessThan(Double value) {
            addCriterion("ck_oo_numberOfPublicMethods <", value, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsLessThanOrEqualTo(Double value) {
            addCriterion("ck_oo_numberOfPublicMethods <=", value, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsIn(List<Double> values) {
            addCriterion("ck_oo_numberOfPublicMethods in", values, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsNotIn(List<Double> values) {
            addCriterion("ck_oo_numberOfPublicMethods not in", values, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfPublicMethods between", value1, value2, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andCkOoNumberofpublicmethodsNotBetween(Double value1, Double value2) {
            addCriterion("ck_oo_numberOfPublicMethods not between", value1, value2, "ckOoNumberofpublicmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhCboIsNull() {
            addCriterion("LDHH_cbo is null");
            return (Criteria) this;
        }

        public Criteria andLdhhCboIsNotNull() {
            addCriterion("LDHH_cbo is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhCboEqualTo(Double value) {
            addCriterion("LDHH_cbo =", value, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboNotEqualTo(Double value) {
            addCriterion("LDHH_cbo <>", value, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboGreaterThan(Double value) {
            addCriterion("LDHH_cbo >", value, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_cbo >=", value, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboLessThan(Double value) {
            addCriterion("LDHH_cbo <", value, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_cbo <=", value, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboIn(List<Double> values) {
            addCriterion("LDHH_cbo in", values, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboNotIn(List<Double> values) {
            addCriterion("LDHH_cbo not in", values, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboBetween(Double value1, Double value2) {
            addCriterion("LDHH_cbo between", value1, value2, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andLdhhCboNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_cbo not between", value1, value2, "ldhhCbo");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeIsNull() {
            addCriterion("WCHU_numberOfLinesOfCode is null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeIsNotNull() {
            addCriterion("WCHU_numberOfLinesOfCode is not null");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeEqualTo(Double value) {
            addCriterion("WCHU_numberOfLinesOfCode =", value, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeNotEqualTo(Double value) {
            addCriterion("WCHU_numberOfLinesOfCode <>", value, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeGreaterThan(Double value) {
            addCriterion("WCHU_numberOfLinesOfCode >", value, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeGreaterThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfLinesOfCode >=", value, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeLessThan(Double value) {
            addCriterion("WCHU_numberOfLinesOfCode <", value, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeLessThanOrEqualTo(Double value) {
            addCriterion("WCHU_numberOfLinesOfCode <=", value, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeIn(List<Double> values) {
            addCriterion("WCHU_numberOfLinesOfCode in", values, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeNotIn(List<Double> values) {
            addCriterion("WCHU_numberOfLinesOfCode not in", values, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfLinesOfCode between", value1, value2, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andWchuNumberoflinesofcodeNotBetween(Double value1, Double value2) {
            addCriterion("WCHU_numberOfLinesOfCode not between", value1, value2, "wchuNumberoflinesofcode");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyIsNull() {
            addCriterion("CvsExpEntropy is null");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyIsNotNull() {
            addCriterion("CvsExpEntropy is not null");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyEqualTo(Double value) {
            addCriterion("CvsExpEntropy =", value, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyNotEqualTo(Double value) {
            addCriterion("CvsExpEntropy <>", value, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyGreaterThan(Double value) {
            addCriterion("CvsExpEntropy >", value, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyGreaterThanOrEqualTo(Double value) {
            addCriterion("CvsExpEntropy >=", value, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyLessThan(Double value) {
            addCriterion("CvsExpEntropy <", value, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyLessThanOrEqualTo(Double value) {
            addCriterion("CvsExpEntropy <=", value, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyIn(List<Double> values) {
            addCriterion("CvsExpEntropy in", values, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyNotIn(List<Double> values) {
            addCriterion("CvsExpEntropy not in", values, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyBetween(Double value1, Double value2) {
            addCriterion("CvsExpEntropy between", value1, value2, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andCvsexpentropyNotBetween(Double value1, Double value2) {
            addCriterion("CvsExpEntropy not between", value1, value2, "cvsexpentropy");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsIsNull() {
            addCriterion("LDHH_numberOfMethods is null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsIsNotNull() {
            addCriterion("LDHH_numberOfMethods is not null");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsEqualTo(Double value) {
            addCriterion("LDHH_numberOfMethods =", value, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsNotEqualTo(Double value) {
            addCriterion("LDHH_numberOfMethods <>", value, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsGreaterThan(Double value) {
            addCriterion("LDHH_numberOfMethods >", value, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsGreaterThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfMethods >=", value, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsLessThan(Double value) {
            addCriterion("LDHH_numberOfMethods <", value, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsLessThanOrEqualTo(Double value) {
            addCriterion("LDHH_numberOfMethods <=", value, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsIn(List<Double> values) {
            addCriterion("LDHH_numberOfMethods in", values, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsNotIn(List<Double> values) {
            addCriterion("LDHH_numberOfMethods not in", values, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfMethods between", value1, value2, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andLdhhNumberofmethodsNotBetween(Double value1, Double value2) {
            addCriterion("LDHH_numberOfMethods not between", value1, value2, "ldhhNumberofmethods");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(Double value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(Double value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(Double value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(Double value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(Double value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(Double value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<Double> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<Double> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(Double value1, Double value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(Double value1, Double value2) {
            addCriterion("classes not between", value1, value2, "classes");
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