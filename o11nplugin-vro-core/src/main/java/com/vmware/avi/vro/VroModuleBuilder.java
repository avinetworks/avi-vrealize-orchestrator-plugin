package com.vmware.avi.vro;

import com.vmware.o11n.plugin.sdk.module.ModuleBuilder;

/**
 * This class contains all the configuration stuff.
 * Auto-generated class stub
 * 
 *
 */
public final class VroModuleBuilder extends ModuleBuilder {

	private static final String DESCRIPTION = "vro plug-in for vRealize Orchestrator";

	private static final String DATASOURCE = "main-datasource";

	@Override
	public void configure() {
		module(Constants.FINDER_VRO_PLUGIN_NAME).displayName(Constants.FINDER_VRO_PLUGIN_NAME).inventory(VroPluginAdaptor.REL_ROOTS)
				.withDescription(DESCRIPTION).withImage("images/default-16x16.png")
				.basePackages(VroModuleBuilder.class.getPackage().getName()).version("${project.version}");

		installation(InstallationMode.VERSION).action(ActionType.INSTALL_PACKAGE,
				"packages/${project.artifactId}-package-${project.version}.package");

		finderDatasource(VroPluginAdaptor.class, DATASOURCE).anonymousLogin(LoginMode.INTERNAL);
		finder(VroPluginAdaptor.REL_ROOTS, DATASOURCE);
				//.addRelation(Constants.FINDER_VRO_PLUGIN, Constants.FINDER_VRO_PLUGIN)
				//.addRelation(Constants.FINDER_AVI_VRO_CLIENT).hide(false);
	}
}
