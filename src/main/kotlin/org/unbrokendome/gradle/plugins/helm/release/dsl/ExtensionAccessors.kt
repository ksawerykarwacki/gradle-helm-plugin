package org.unbrokendome.gradle.plugins.helm.release.dsl

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.provider.Property
import org.unbrokendome.gradle.plugins.helm.HELM_ACTIVE_RELEASE_TARGET_EXTENSION_NAME
import org.unbrokendome.gradle.plugins.helm.HELM_RELEASES_EXTENSION_NAME
import org.unbrokendome.gradle.plugins.helm.HELM_RELEASE_TARGETS_EXTENSION_NAME
import org.unbrokendome.gradle.plugins.helm.dsl.HelmExtension
import org.unbrokendome.gradle.plugins.helm.util.requiredExtension


/**
 * Gets the `releases` sub-extension.
 */
internal val HelmExtension.releases: NamedDomainObjectContainer<HelmRelease>
    get() = requiredExtension(HELM_RELEASES_EXTENSION_NAME)


/**
 * Gets the `releaseTargets` sub-extension.
 */
internal val HelmExtension.releaseTargets: NamedDomainObjectContainer<HelmReleaseTarget>
    get() = requiredExtension(HELM_RELEASE_TARGETS_EXTENSION_NAME)


/**
 * Gets the `activeReleaseTarget` sub-extension.
 */
internal val HelmExtension.activeReleaseTarget: Property<String>
    get() = requiredExtension(HELM_ACTIVE_RELEASE_TARGET_EXTENSION_NAME)
