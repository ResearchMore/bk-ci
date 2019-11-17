/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.plugin.tables;


import com.tencent.devops.model.plugin.DevopsPlugin;
import com.tencent.devops.model.plugin.Keys;
import com.tencent.devops.model.plugin.tables.records.TPluginZhiyunProductRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPluginZhiyunProduct extends TableImpl<TPluginZhiyunProductRecord> {

    private static final long serialVersionUID = 41923444;

    /**
     * The reference instance of <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT</code>
     */
    public static final TPluginZhiyunProduct T_PLUGIN_ZHIYUN_PRODUCT = new TPluginZhiyunProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPluginZhiyunProductRecord> getRecordType() {
        return TPluginZhiyunProductRecord.class;
    }

    /**
     * The column <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT.ID</code>.
     */
    public final TableField<TPluginZhiyunProductRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT.PRODUCT_ID</code>.
     */
    public final TableField<TPluginZhiyunProductRecord, String> PRODUCT_ID = createField("PRODUCT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT.PRODUCT_NAME</code>.
     */
    public final TableField<TPluginZhiyunProductRecord, String> PRODUCT_NAME = createField("PRODUCT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT.CREATED_TIME</code>.
     */
    public final TableField<TPluginZhiyunProductRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT.UPDATED_TIME</code>.
     */
    public final TableField<TPluginZhiyunProductRecord, LocalDateTime> UPDATED_TIME = createField("UPDATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT</code> table reference
     */
    public TPluginZhiyunProduct() {
        this("T_PLUGIN_ZHIYUN_PRODUCT", null);
    }

    /**
     * Create an aliased <code>devops_plugin.T_PLUGIN_ZHIYUN_PRODUCT</code> table reference
     */
    public TPluginZhiyunProduct(String alias) {
        this(alias, T_PLUGIN_ZHIYUN_PRODUCT);
    }

    private TPluginZhiyunProduct(String alias, Table<TPluginZhiyunProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPluginZhiyunProduct(String alias, Table<TPluginZhiyunProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsPlugin.DEVOPS_PLUGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TPluginZhiyunProductRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_PLUGIN_ZHIYUN_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPluginZhiyunProductRecord> getPrimaryKey() {
        return Keys.KEY_T_PLUGIN_ZHIYUN_PRODUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPluginZhiyunProductRecord>> getKeys() {
        return Arrays.<UniqueKey<TPluginZhiyunProductRecord>>asList(Keys.KEY_T_PLUGIN_ZHIYUN_PRODUCT_PRIMARY, Keys.KEY_T_PLUGIN_ZHIYUN_PRODUCT_PRODUCT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginZhiyunProduct as(String alias) {
        return new TPluginZhiyunProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPluginZhiyunProduct rename(String name) {
        return new TPluginZhiyunProduct(name, null);
    }
}