/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality;


import com.tencent.devops.model.quality.tables.TControlPoint;
import com.tencent.devops.model.quality.tables.TControlPointMetadata;
import com.tencent.devops.model.quality.tables.TControlPointTask;
import com.tencent.devops.model.quality.tables.TCountIntercept;
import com.tencent.devops.model.quality.tables.TCountPipeline;
import com.tencent.devops.model.quality.tables.TCountRule;
import com.tencent.devops.model.quality.tables.TGroup;
import com.tencent.devops.model.quality.tables.THistory;
import com.tencent.devops.model.quality.tables.TQualityControlPoint;
import com.tencent.devops.model.quality.tables.TQualityHisDetailMetadata;
import com.tencent.devops.model.quality.tables.TQualityHisOriginMetadata;
import com.tencent.devops.model.quality.tables.TQualityIndicator;
import com.tencent.devops.model.quality.tables.TQualityMetadata;
import com.tencent.devops.model.quality.tables.TQualityRule;
import com.tencent.devops.model.quality.tables.TQualityRuleMap;
import com.tencent.devops.model.quality.tables.TQualityRuleOperation;
import com.tencent.devops.model.quality.tables.TQualityRuleTemplate;
import com.tencent.devops.model.quality.tables.TQualityTemplateIndicatorMap;
import com.tencent.devops.model.quality.tables.TRule;
import com.tencent.devops.model.quality.tables.TTask;
import com.tencent.devops.model.quality.tables.records.TControlPointMetadataRecord;
import com.tencent.devops.model.quality.tables.records.TControlPointRecord;
import com.tencent.devops.model.quality.tables.records.TControlPointTaskRecord;
import com.tencent.devops.model.quality.tables.records.TCountInterceptRecord;
import com.tencent.devops.model.quality.tables.records.TCountPipelineRecord;
import com.tencent.devops.model.quality.tables.records.TCountRuleRecord;
import com.tencent.devops.model.quality.tables.records.TGroupRecord;
import com.tencent.devops.model.quality.tables.records.THistoryRecord;
import com.tencent.devops.model.quality.tables.records.TQualityControlPointRecord;
import com.tencent.devops.model.quality.tables.records.TQualityHisDetailMetadataRecord;
import com.tencent.devops.model.quality.tables.records.TQualityHisOriginMetadataRecord;
import com.tencent.devops.model.quality.tables.records.TQualityIndicatorRecord;
import com.tencent.devops.model.quality.tables.records.TQualityMetadataRecord;
import com.tencent.devops.model.quality.tables.records.TQualityRuleMapRecord;
import com.tencent.devops.model.quality.tables.records.TQualityRuleOperationRecord;
import com.tencent.devops.model.quality.tables.records.TQualityRuleRecord;
import com.tencent.devops.model.quality.tables.records.TQualityRuleTemplateRecord;
import com.tencent.devops.model.quality.tables.records.TQualityTemplateIndicatorMapRecord;
import com.tencent.devops.model.quality.tables.records.TRuleRecord;
import com.tencent.devops.model.quality.tables.records.TTaskRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>devops_quality</code> 
 * schema
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TControlPointRecord, Integer> IDENTITY_T_CONTROL_POINT = Identities0.IDENTITY_T_CONTROL_POINT;
    public static final Identity<TCountInterceptRecord, Long> IDENTITY_T_COUNT_INTERCEPT = Identities0.IDENTITY_T_COUNT_INTERCEPT;
    public static final Identity<TCountPipelineRecord, Long> IDENTITY_T_COUNT_PIPELINE = Identities0.IDENTITY_T_COUNT_PIPELINE;
    public static final Identity<TCountRuleRecord, Long> IDENTITY_T_COUNT_RULE = Identities0.IDENTITY_T_COUNT_RULE;
    public static final Identity<TGroupRecord, Long> IDENTITY_T_GROUP = Identities0.IDENTITY_T_GROUP;
    public static final Identity<THistoryRecord, Long> IDENTITY_T_HISTORY = Identities0.IDENTITY_T_HISTORY;
    public static final Identity<TQualityControlPointRecord, Long> IDENTITY_T_QUALITY_CONTROL_POINT = Identities0.IDENTITY_T_QUALITY_CONTROL_POINT;
    public static final Identity<TQualityHisDetailMetadataRecord, Long> IDENTITY_T_QUALITY_HIS_DETAIL_METADATA = Identities0.IDENTITY_T_QUALITY_HIS_DETAIL_METADATA;
    public static final Identity<TQualityHisOriginMetadataRecord, Long> IDENTITY_T_QUALITY_HIS_ORIGIN_METADATA = Identities0.IDENTITY_T_QUALITY_HIS_ORIGIN_METADATA;
    public static final Identity<TQualityIndicatorRecord, Long> IDENTITY_T_QUALITY_INDICATOR = Identities0.IDENTITY_T_QUALITY_INDICATOR;
    public static final Identity<TQualityMetadataRecord, Long> IDENTITY_T_QUALITY_METADATA = Identities0.IDENTITY_T_QUALITY_METADATA;
    public static final Identity<TQualityRuleRecord, Long> IDENTITY_T_QUALITY_RULE = Identities0.IDENTITY_T_QUALITY_RULE;
    public static final Identity<TQualityRuleMapRecord, Long> IDENTITY_T_QUALITY_RULE_MAP = Identities0.IDENTITY_T_QUALITY_RULE_MAP;
    public static final Identity<TQualityRuleOperationRecord, Long> IDENTITY_T_QUALITY_RULE_OPERATION = Identities0.IDENTITY_T_QUALITY_RULE_OPERATION;
    public static final Identity<TQualityRuleTemplateRecord, Long> IDENTITY_T_QUALITY_RULE_TEMPLATE = Identities0.IDENTITY_T_QUALITY_RULE_TEMPLATE;
    public static final Identity<TQualityTemplateIndicatorMapRecord, Long> IDENTITY_T_QUALITY_TEMPLATE_INDICATOR_MAP = Identities0.IDENTITY_T_QUALITY_TEMPLATE_INDICATOR_MAP;
    public static final Identity<TRuleRecord, Long> IDENTITY_T_RULE = Identities0.IDENTITY_T_RULE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TControlPointRecord> KEY_T_CONTROL_POINT_PRIMARY = UniqueKeys0.KEY_T_CONTROL_POINT_PRIMARY;
    public static final UniqueKey<TControlPointMetadataRecord> KEY_T_CONTROL_POINT_METADATA_PRIMARY = UniqueKeys0.KEY_T_CONTROL_POINT_METADATA_PRIMARY;
    public static final UniqueKey<TControlPointTaskRecord> KEY_T_CONTROL_POINT_TASK_PRIMARY = UniqueKeys0.KEY_T_CONTROL_POINT_TASK_PRIMARY;
    public static final UniqueKey<TCountInterceptRecord> KEY_T_COUNT_INTERCEPT_PRIMARY = UniqueKeys0.KEY_T_COUNT_INTERCEPT_PRIMARY;
    public static final UniqueKey<TCountInterceptRecord> KEY_T_COUNT_INTERCEPT_PROJECT_ID_DATE = UniqueKeys0.KEY_T_COUNT_INTERCEPT_PROJECT_ID_DATE;
    public static final UniqueKey<TCountPipelineRecord> KEY_T_COUNT_PIPELINE_PRIMARY = UniqueKeys0.KEY_T_COUNT_PIPELINE_PRIMARY;
    public static final UniqueKey<TCountPipelineRecord> KEY_T_COUNT_PIPELINE_PROJECT_ID_PIPELINE_ID_DATE = UniqueKeys0.KEY_T_COUNT_PIPELINE_PROJECT_ID_PIPELINE_ID_DATE;
    public static final UniqueKey<TCountRuleRecord> KEY_T_COUNT_RULE_PRIMARY = UniqueKeys0.KEY_T_COUNT_RULE_PRIMARY;
    public static final UniqueKey<TCountRuleRecord> KEY_T_COUNT_RULE_PROJECT_ID_RULE_ID_DATE = UniqueKeys0.KEY_T_COUNT_RULE_PROJECT_ID_RULE_ID_DATE;
    public static final UniqueKey<TGroupRecord> KEY_T_GROUP_PRIMARY = UniqueKeys0.KEY_T_GROUP_PRIMARY;
    public static final UniqueKey<THistoryRecord> KEY_T_HISTORY_PRIMARY = UniqueKeys0.KEY_T_HISTORY_PRIMARY;
    public static final UniqueKey<TQualityControlPointRecord> KEY_T_QUALITY_CONTROL_POINT_PRIMARY = UniqueKeys0.KEY_T_QUALITY_CONTROL_POINT_PRIMARY;
    public static final UniqueKey<TQualityControlPointRecord> KEY_T_QUALITY_CONTROL_POINT_ELEMENT_TYPE_INDEX = UniqueKeys0.KEY_T_QUALITY_CONTROL_POINT_ELEMENT_TYPE_INDEX;
    public static final UniqueKey<TQualityHisDetailMetadataRecord> KEY_T_QUALITY_HIS_DETAIL_METADATA_PRIMARY = UniqueKeys0.KEY_T_QUALITY_HIS_DETAIL_METADATA_PRIMARY;
    public static final UniqueKey<TQualityHisOriginMetadataRecord> KEY_T_QUALITY_HIS_ORIGIN_METADATA_PRIMARY = UniqueKeys0.KEY_T_QUALITY_HIS_ORIGIN_METADATA_PRIMARY;
    public static final UniqueKey<TQualityIndicatorRecord> KEY_T_QUALITY_INDICATOR_PRIMARY = UniqueKeys0.KEY_T_QUALITY_INDICATOR_PRIMARY;
    public static final UniqueKey<TQualityMetadataRecord> KEY_T_QUALITY_METADATA_PRIMARY = UniqueKeys0.KEY_T_QUALITY_METADATA_PRIMARY;
    public static final UniqueKey<TQualityRuleRecord> KEY_T_QUALITY_RULE_PRIMARY = UniqueKeys0.KEY_T_QUALITY_RULE_PRIMARY;
    public static final UniqueKey<TQualityRuleMapRecord> KEY_T_QUALITY_RULE_MAP_PRIMARY = UniqueKeys0.KEY_T_QUALITY_RULE_MAP_PRIMARY;
    public static final UniqueKey<TQualityRuleMapRecord> KEY_T_QUALITY_RULE_MAP_RULE_INDEX = UniqueKeys0.KEY_T_QUALITY_RULE_MAP_RULE_INDEX;
    public static final UniqueKey<TQualityRuleOperationRecord> KEY_T_QUALITY_RULE_OPERATION_PRIMARY = UniqueKeys0.KEY_T_QUALITY_RULE_OPERATION_PRIMARY;
    public static final UniqueKey<TQualityRuleOperationRecord> KEY_T_QUALITY_RULE_OPERATION_RULE_ID_INDEX = UniqueKeys0.KEY_T_QUALITY_RULE_OPERATION_RULE_ID_INDEX;
    public static final UniqueKey<TQualityRuleTemplateRecord> KEY_T_QUALITY_RULE_TEMPLATE_PRIMARY = UniqueKeys0.KEY_T_QUALITY_RULE_TEMPLATE_PRIMARY;
    public static final UniqueKey<TQualityTemplateIndicatorMapRecord> KEY_T_QUALITY_TEMPLATE_INDICATOR_MAP_PRIMARY = UniqueKeys0.KEY_T_QUALITY_TEMPLATE_INDICATOR_MAP_PRIMARY;
    public static final UniqueKey<TRuleRecord> KEY_T_RULE_PRIMARY = UniqueKeys0.KEY_T_RULE_PRIMARY;
    public static final UniqueKey<TTaskRecord> KEY_T_TASK_PRIMARY = UniqueKeys0.KEY_T_TASK_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<TControlPointRecord, Integer> IDENTITY_T_CONTROL_POINT = createIdentity(TControlPoint.T_CONTROL_POINT, TControlPoint.T_CONTROL_POINT.ID);
        public static Identity<TCountInterceptRecord, Long> IDENTITY_T_COUNT_INTERCEPT = createIdentity(TCountIntercept.T_COUNT_INTERCEPT, TCountIntercept.T_COUNT_INTERCEPT.ID);
        public static Identity<TCountPipelineRecord, Long> IDENTITY_T_COUNT_PIPELINE = createIdentity(TCountPipeline.T_COUNT_PIPELINE, TCountPipeline.T_COUNT_PIPELINE.ID);
        public static Identity<TCountRuleRecord, Long> IDENTITY_T_COUNT_RULE = createIdentity(TCountRule.T_COUNT_RULE, TCountRule.T_COUNT_RULE.ID);
        public static Identity<TGroupRecord, Long> IDENTITY_T_GROUP = createIdentity(TGroup.T_GROUP, TGroup.T_GROUP.ID);
        public static Identity<THistoryRecord, Long> IDENTITY_T_HISTORY = createIdentity(THistory.T_HISTORY, THistory.T_HISTORY.ID);
        public static Identity<TQualityControlPointRecord, Long> IDENTITY_T_QUALITY_CONTROL_POINT = createIdentity(TQualityControlPoint.T_QUALITY_CONTROL_POINT, TQualityControlPoint.T_QUALITY_CONTROL_POINT.ID);
        public static Identity<TQualityHisDetailMetadataRecord, Long> IDENTITY_T_QUALITY_HIS_DETAIL_METADATA = createIdentity(TQualityHisDetailMetadata.T_QUALITY_HIS_DETAIL_METADATA, TQualityHisDetailMetadata.T_QUALITY_HIS_DETAIL_METADATA.ID);
        public static Identity<TQualityHisOriginMetadataRecord, Long> IDENTITY_T_QUALITY_HIS_ORIGIN_METADATA = createIdentity(TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA, TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA.ID);
        public static Identity<TQualityIndicatorRecord, Long> IDENTITY_T_QUALITY_INDICATOR = createIdentity(TQualityIndicator.T_QUALITY_INDICATOR, TQualityIndicator.T_QUALITY_INDICATOR.ID);
        public static Identity<TQualityMetadataRecord, Long> IDENTITY_T_QUALITY_METADATA = createIdentity(TQualityMetadata.T_QUALITY_METADATA, TQualityMetadata.T_QUALITY_METADATA.ID);
        public static Identity<TQualityRuleRecord, Long> IDENTITY_T_QUALITY_RULE = createIdentity(TQualityRule.T_QUALITY_RULE, TQualityRule.T_QUALITY_RULE.ID);
        public static Identity<TQualityRuleMapRecord, Long> IDENTITY_T_QUALITY_RULE_MAP = createIdentity(TQualityRuleMap.T_QUALITY_RULE_MAP, TQualityRuleMap.T_QUALITY_RULE_MAP.ID);
        public static Identity<TQualityRuleOperationRecord, Long> IDENTITY_T_QUALITY_RULE_OPERATION = createIdentity(TQualityRuleOperation.T_QUALITY_RULE_OPERATION, TQualityRuleOperation.T_QUALITY_RULE_OPERATION.ID);
        public static Identity<TQualityRuleTemplateRecord, Long> IDENTITY_T_QUALITY_RULE_TEMPLATE = createIdentity(TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE, TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.ID);
        public static Identity<TQualityTemplateIndicatorMapRecord, Long> IDENTITY_T_QUALITY_TEMPLATE_INDICATOR_MAP = createIdentity(TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP, TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP.ID);
        public static Identity<TRuleRecord, Long> IDENTITY_T_RULE = createIdentity(TRule.T_RULE, TRule.T_RULE.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<TControlPointRecord> KEY_T_CONTROL_POINT_PRIMARY = createUniqueKey(TControlPoint.T_CONTROL_POINT, "KEY_T_CONTROL_POINT_PRIMARY", TControlPoint.T_CONTROL_POINT.ID);
        public static final UniqueKey<TControlPointMetadataRecord> KEY_T_CONTROL_POINT_METADATA_PRIMARY = createUniqueKey(TControlPointMetadata.T_CONTROL_POINT_METADATA, "KEY_T_CONTROL_POINT_METADATA_PRIMARY", TControlPointMetadata.T_CONTROL_POINT_METADATA.METADATA_ID);
        public static final UniqueKey<TControlPointTaskRecord> KEY_T_CONTROL_POINT_TASK_PRIMARY = createUniqueKey(TControlPointTask.T_CONTROL_POINT_TASK, "KEY_T_CONTROL_POINT_TASK_PRIMARY", TControlPointTask.T_CONTROL_POINT_TASK.ID);
        public static final UniqueKey<TCountInterceptRecord> KEY_T_COUNT_INTERCEPT_PRIMARY = createUniqueKey(TCountIntercept.T_COUNT_INTERCEPT, "KEY_T_COUNT_INTERCEPT_PRIMARY", TCountIntercept.T_COUNT_INTERCEPT.ID);
        public static final UniqueKey<TCountInterceptRecord> KEY_T_COUNT_INTERCEPT_PROJECT_ID_DATE = createUniqueKey(TCountIntercept.T_COUNT_INTERCEPT, "KEY_T_COUNT_INTERCEPT_PROJECT_ID_DATE", TCountIntercept.T_COUNT_INTERCEPT.PROJECT_ID, TCountIntercept.T_COUNT_INTERCEPT.DATE);
        public static final UniqueKey<TCountPipelineRecord> KEY_T_COUNT_PIPELINE_PRIMARY = createUniqueKey(TCountPipeline.T_COUNT_PIPELINE, "KEY_T_COUNT_PIPELINE_PRIMARY", TCountPipeline.T_COUNT_PIPELINE.ID);
        public static final UniqueKey<TCountPipelineRecord> KEY_T_COUNT_PIPELINE_PROJECT_ID_PIPELINE_ID_DATE = createUniqueKey(TCountPipeline.T_COUNT_PIPELINE, "KEY_T_COUNT_PIPELINE_PROJECT_ID_PIPELINE_ID_DATE", TCountPipeline.T_COUNT_PIPELINE.PROJECT_ID, TCountPipeline.T_COUNT_PIPELINE.PIPELINE_ID, TCountPipeline.T_COUNT_PIPELINE.DATE);
        public static final UniqueKey<TCountRuleRecord> KEY_T_COUNT_RULE_PRIMARY = createUniqueKey(TCountRule.T_COUNT_RULE, "KEY_T_COUNT_RULE_PRIMARY", TCountRule.T_COUNT_RULE.ID);
        public static final UniqueKey<TCountRuleRecord> KEY_T_COUNT_RULE_PROJECT_ID_RULE_ID_DATE = createUniqueKey(TCountRule.T_COUNT_RULE, "KEY_T_COUNT_RULE_PROJECT_ID_RULE_ID_DATE", TCountRule.T_COUNT_RULE.PROJECT_ID, TCountRule.T_COUNT_RULE.RULE_ID, TCountRule.T_COUNT_RULE.DATE);
        public static final UniqueKey<TGroupRecord> KEY_T_GROUP_PRIMARY = createUniqueKey(TGroup.T_GROUP, "KEY_T_GROUP_PRIMARY", TGroup.T_GROUP.ID);
        public static final UniqueKey<THistoryRecord> KEY_T_HISTORY_PRIMARY = createUniqueKey(THistory.T_HISTORY, "KEY_T_HISTORY_PRIMARY", THistory.T_HISTORY.ID);
        public static final UniqueKey<TQualityControlPointRecord> KEY_T_QUALITY_CONTROL_POINT_PRIMARY = createUniqueKey(TQualityControlPoint.T_QUALITY_CONTROL_POINT, "KEY_T_QUALITY_CONTROL_POINT_PRIMARY", TQualityControlPoint.T_QUALITY_CONTROL_POINT.ID);
        public static final UniqueKey<TQualityControlPointRecord> KEY_T_QUALITY_CONTROL_POINT_ELEMENT_TYPE_INDEX = createUniqueKey(TQualityControlPoint.T_QUALITY_CONTROL_POINT, "KEY_T_QUALITY_CONTROL_POINT_ELEMENT_TYPE_INDEX", TQualityControlPoint.T_QUALITY_CONTROL_POINT.ELEMENT_TYPE);
        public static final UniqueKey<TQualityHisDetailMetadataRecord> KEY_T_QUALITY_HIS_DETAIL_METADATA_PRIMARY = createUniqueKey(TQualityHisDetailMetadata.T_QUALITY_HIS_DETAIL_METADATA, "KEY_T_QUALITY_HIS_DETAIL_METADATA_PRIMARY", TQualityHisDetailMetadata.T_QUALITY_HIS_DETAIL_METADATA.ID);
        public static final UniqueKey<TQualityHisOriginMetadataRecord> KEY_T_QUALITY_HIS_ORIGIN_METADATA_PRIMARY = createUniqueKey(TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA, "KEY_T_QUALITY_HIS_ORIGIN_METADATA_PRIMARY", TQualityHisOriginMetadata.T_QUALITY_HIS_ORIGIN_METADATA.ID);
        public static final UniqueKey<TQualityIndicatorRecord> KEY_T_QUALITY_INDICATOR_PRIMARY = createUniqueKey(TQualityIndicator.T_QUALITY_INDICATOR, "KEY_T_QUALITY_INDICATOR_PRIMARY", TQualityIndicator.T_QUALITY_INDICATOR.ID);
        public static final UniqueKey<TQualityMetadataRecord> KEY_T_QUALITY_METADATA_PRIMARY = createUniqueKey(TQualityMetadata.T_QUALITY_METADATA, "KEY_T_QUALITY_METADATA_PRIMARY", TQualityMetadata.T_QUALITY_METADATA.ID);
        public static final UniqueKey<TQualityRuleRecord> KEY_T_QUALITY_RULE_PRIMARY = createUniqueKey(TQualityRule.T_QUALITY_RULE, "KEY_T_QUALITY_RULE_PRIMARY", TQualityRule.T_QUALITY_RULE.ID);
        public static final UniqueKey<TQualityRuleMapRecord> KEY_T_QUALITY_RULE_MAP_PRIMARY = createUniqueKey(TQualityRuleMap.T_QUALITY_RULE_MAP, "KEY_T_QUALITY_RULE_MAP_PRIMARY", TQualityRuleMap.T_QUALITY_RULE_MAP.ID);
        public static final UniqueKey<TQualityRuleMapRecord> KEY_T_QUALITY_RULE_MAP_RULE_INDEX = createUniqueKey(TQualityRuleMap.T_QUALITY_RULE_MAP, "KEY_T_QUALITY_RULE_MAP_RULE_INDEX", TQualityRuleMap.T_QUALITY_RULE_MAP.RULE_ID);
        public static final UniqueKey<TQualityRuleOperationRecord> KEY_T_QUALITY_RULE_OPERATION_PRIMARY = createUniqueKey(TQualityRuleOperation.T_QUALITY_RULE_OPERATION, "KEY_T_QUALITY_RULE_OPERATION_PRIMARY", TQualityRuleOperation.T_QUALITY_RULE_OPERATION.ID);
        public static final UniqueKey<TQualityRuleOperationRecord> KEY_T_QUALITY_RULE_OPERATION_RULE_ID_INDEX = createUniqueKey(TQualityRuleOperation.T_QUALITY_RULE_OPERATION, "KEY_T_QUALITY_RULE_OPERATION_RULE_ID_INDEX", TQualityRuleOperation.T_QUALITY_RULE_OPERATION.RULE_ID);
        public static final UniqueKey<TQualityRuleTemplateRecord> KEY_T_QUALITY_RULE_TEMPLATE_PRIMARY = createUniqueKey(TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE, "KEY_T_QUALITY_RULE_TEMPLATE_PRIMARY", TQualityRuleTemplate.T_QUALITY_RULE_TEMPLATE.ID);
        public static final UniqueKey<TQualityTemplateIndicatorMapRecord> KEY_T_QUALITY_TEMPLATE_INDICATOR_MAP_PRIMARY = createUniqueKey(TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP, "KEY_T_QUALITY_TEMPLATE_INDICATOR_MAP_PRIMARY", TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP.ID);
        public static final UniqueKey<TRuleRecord> KEY_T_RULE_PRIMARY = createUniqueKey(TRule.T_RULE, "KEY_T_RULE_PRIMARY", TRule.T_RULE.ID);
        public static final UniqueKey<TTaskRecord> KEY_T_TASK_PRIMARY = createUniqueKey(TTask.T_TASK, "KEY_T_TASK_PRIMARY", TTask.T_TASK.ID);
    }
}