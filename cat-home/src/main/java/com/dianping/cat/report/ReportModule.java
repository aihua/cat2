package com.dianping.cat.report;

import org.unidal.cat.plugin.event.page.Handler;
import org.unidal.web.mvc.AbstractModule;
import org.unidal.web.mvc.annotation.ModuleMeta;
import org.unidal.web.mvc.annotation.ModulePagesMeta;

@ModuleMeta(name = "r", defaultInboundAction = "top", defaultTransition = "default", defaultErrorAction = "default")
@ModulePagesMeta({

com.dianping.cat.report.page.home.Handler.class,

com.dianping.cat.report.page.problem.Handler.class,

org.unidal.cat.plugin.transaction.page.Handler.class,

Handler.class,

com.dianping.cat.report.page.heartbeat.Handler.class,

com.dianping.cat.report.page.logview.Handler.class,

com.dianping.cat.report.page.model.Handler.class,

com.dianping.cat.report.page.dashboard.Handler.class,

com.dianping.cat.report.page.matrix.Handler.class,

com.dianping.cat.report.page.cross.Handler.class,

com.dianping.cat.report.page.cache.Handler.class,

com.dianping.cat.report.page.state.Handler.class,

com.dianping.cat.report.page.metric.Handler.class,

com.dianping.cat.report.page.dependency.Handler.class,

com.dianping.cat.report.page.statistics.Handler.class,

com.dianping.cat.report.page.alteration.Handler.class,

com.dianping.cat.report.page.monitor.Handler.class,

com.dianping.cat.report.page.network.Handler.class,

com.dianping.cat.report.page.web.Handler.class,

com.dianping.cat.report.page.system.Handler.class,

com.dianping.cat.report.page.cdn.Handler.class,

com.dianping.cat.report.page.app.Handler.class,

com.dianping.cat.report.page.alert.Handler.class,

com.dianping.cat.report.page.overload.Handler.class,

com.dianping.cat.report.page.database.Handler.class,

com.dianping.cat.report.page.storage.Handler.class,

com.dianping.cat.report.page.activity.Handler.class,

com.dianping.cat.report.page.top.Handler.class,

com.dianping.cat.report.page.service.Handler.class
})
public class ReportModule extends AbstractModule {

}
