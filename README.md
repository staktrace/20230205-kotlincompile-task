Steps to reproduce:
1. Clone this project
2. Run `./gradlew :code:classes --stacktrace`

Expected behaviour: success

Actual behaviour: `java.lang.ClassNotFoundException: org.jetbrains.kotlin.gradle.tasks.KotlinCompile`

<details>
<summary>Expand for full output</summary>

```
> Task :buildSrc:pluginDescriptors
> Task :buildSrc:processResources NO-SOURCE
> Task :buildSrc:processTestResources NO-SOURCE
> Task :buildSrc:compileKotlin
> Task :buildSrc:compileJava NO-SOURCE
> Task :buildSrc:compileGroovy NO-SOURCE
> Task :buildSrc:classes UP-TO-DATE
> Task :buildSrc:inspectClassesForKotlinIC

> Task :buildSrc:jar
:jar: No valid plugin descriptors were found in META-INF/gradle-plugins

> Task :buildSrc:assemble
> Task :buildSrc:compileTestKotlin NO-SOURCE
> Task :buildSrc:compileTestJava NO-SOURCE
> Task :buildSrc:compileTestGroovy NO-SOURCE
> Task :buildSrc:pluginUnderTestMetadata
> Task :buildSrc:testClasses UP-TO-DATE
> Task :buildSrc:test NO-SOURCE
> Task :buildSrc:validatePlugins
> Task :buildSrc:check
> Task :buildSrc:build

FAILURE: Build failed with an exception.

* Where:
Build file '/Users/kartikaya/zspace/gradle-bugs/20230205-kotlincompile-task/code/build.gradle.kts' line: 1

* What went wrong:
org/jetbrains/kotlin/gradle/tasks/KotlinCompile
> org.jetbrains.kotlin.gradle.tasks.KotlinCompile

* Try:
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Exception is:
java.lang.NoClassDefFoundError: org/jetbrains/kotlin/gradle/tasks/KotlinCompile
	at MyPlugin$apply$1$1$1$1.execute(MyPlugin.kt:14)
	at MyPlugin$apply$1$1$1$1.execute(MyPlugin.kt:4)
	at org.gradle.api.internal.plugins.DefaultPluginManager$2.execute(DefaultPluginManager.java:258)
	at org.gradle.api.internal.plugins.DefaultPluginManager$2.execute(DefaultPluginManager.java:255)
	at org.gradle.configuration.internal.DefaultUserCodeApplicationContext$CurrentApplication$1.execute(DefaultUserCodeApplicationContext.java:123)
	at org.gradle.api.internal.DefaultCollectionCallbackActionDecorator$BuildOperationEmittingAction$1.run(DefaultCollectionCallbackActionDecorator.java:110)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
	at org.gradle.api.internal.DefaultCollectionCallbackActionDecorator$BuildOperationEmittingAction.execute(DefaultCollectionCallbackActionDecorator.java:107)
	at org.gradle.internal.ImmutableActionSet$SingletonSet.execute(ImmutableActionSet.java:225)
	at org.gradle.api.internal.DefaultDomainObjectCollection.doAdd(DefaultDomainObjectCollection.java:262)
	at org.gradle.api.internal.DefaultDomainObjectCollection.add(DefaultDomainObjectCollection.java:251)
	at org.gradle.api.internal.plugins.DefaultPluginManager$1.run(DefaultPluginManager.java:114)
	at org.gradle.api.internal.plugins.DefaultPluginManager.addPlugin(DefaultPluginManager.java:198)
	at org.gradle.api.internal.plugins.DefaultPluginManager.access$100(DefaultPluginManager.java:52)
	at org.gradle.api.internal.plugins.DefaultPluginManager$AddPluginBuildOperation.run(DefaultPluginManager.java:282)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
	at org.gradle.api.internal.plugins.DefaultPluginManager.lambda$doApply$0(DefaultPluginManager.java:167)
	at org.gradle.configuration.internal.DefaultUserCodeApplicationContext.apply(DefaultUserCodeApplicationContext.java:44)
	at org.gradle.api.internal.plugins.DefaultPluginManager.doApply(DefaultPluginManager.java:166)
	at org.gradle.api.internal.plugins.DefaultPluginManager.apply(DefaultPluginManager.java:146)
	at org.gradle.api.internal.plugins.DefaultObjectConfigurationAction.applyType(DefaultObjectConfigurationAction.java:167)
	at org.gradle.api.internal.plugins.DefaultObjectConfigurationAction.access$200(DefaultObjectConfigurationAction.java:43)
	at org.gradle.api.internal.plugins.DefaultObjectConfigurationAction$3.run(DefaultObjectConfigurationAction.java:98)
	at org.gradle.api.internal.plugins.DefaultObjectConfigurationAction.execute(DefaultObjectConfigurationAction.java:190)
	at org.gradle.api.internal.project.AbstractPluginAware.apply(AbstractPluginAware.java:42)
	at org.gradle.kotlin.dsl.support.CompiledKotlinBuildScript.apply(CompiledKotlinBuildScript.kt)
	at org.gradle.kotlin.dsl.PluginAwareExtensionsKt.apply(PluginAwareExtensions.kt:33)
	at org.gradle.kotlin.dsl.PluginAwareExtensionsKt.apply$default(PluginAwareExtensions.kt:31)
	at Build_gradle.<init>(build.gradle.kts:1)
	at Program.execute(Unknown Source)
	at org.gradle.kotlin.dsl.execution.Interpreter$ProgramHost.eval(Interpreter.kt:532)
	at org.gradle.kotlin.dsl.execution.Interpreter$ProgramHost.evaluateSecondStageOf(Interpreter.kt:456)
	at Program.execute(Unknown Source)
	at org.gradle.kotlin.dsl.execution.Interpreter$ProgramHost.eval(Interpreter.kt:532)
	at org.gradle.kotlin.dsl.execution.Interpreter.eval(Interpreter.kt:205)
	at org.gradle.kotlin.dsl.provider.StandardKotlinScriptEvaluator.evaluate(KotlinScriptEvaluator.kt:115)
	at org.gradle.kotlin.dsl.provider.KotlinScriptPluginFactory$create$1.invoke(KotlinScriptPluginFactory.kt:51)
	at org.gradle.kotlin.dsl.provider.KotlinScriptPluginFactory$create$1.invoke(KotlinScriptPluginFactory.kt:36)
	at org.gradle.kotlin.dsl.provider.KotlinScriptPlugin.apply(KotlinScriptPlugin.kt:34)
	at org.gradle.configuration.BuildOperationScriptPlugin$1.run(BuildOperationScriptPlugin.java:65)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
	at org.gradle.configuration.BuildOperationScriptPlugin.lambda$apply$0(BuildOperationScriptPlugin.java:62)
	at org.gradle.configuration.internal.DefaultUserCodeApplicationContext.apply(DefaultUserCodeApplicationContext.java:44)
	at org.gradle.configuration.BuildOperationScriptPlugin.apply(BuildOperationScriptPlugin.java:62)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.lambda$applyToMutableState$0(DefaultProjectStateRegistry.java:360)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.fromMutableState(DefaultProjectStateRegistry.java:378)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.applyToMutableState(DefaultProjectStateRegistry.java:359)
	at org.gradle.configuration.project.BuildScriptProcessor.execute(BuildScriptProcessor.java:42)
	at org.gradle.configuration.project.BuildScriptProcessor.execute(BuildScriptProcessor.java:26)
	at org.gradle.configuration.project.ConfigureActionsProjectEvaluator.evaluate(ConfigureActionsProjectEvaluator.java:35)
	at org.gradle.configuration.project.LifecycleProjectEvaluator$EvaluateProject.lambda$run$0(LifecycleProjectEvaluator.java:109)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.lambda$applyToMutableState$0(DefaultProjectStateRegistry.java:360)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.lambda$fromMutableState$1(DefaultProjectStateRegistry.java:383)
	at org.gradle.internal.work.DefaultWorkerLeaseService.withReplacedLocks(DefaultWorkerLeaseService.java:345)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.fromMutableState(DefaultProjectStateRegistry.java:383)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.applyToMutableState(DefaultProjectStateRegistry.java:359)
	at org.gradle.configuration.project.LifecycleProjectEvaluator$EvaluateProject.run(LifecycleProjectEvaluator.java:100)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
	at org.gradle.configuration.project.LifecycleProjectEvaluator.evaluate(LifecycleProjectEvaluator.java:72)
	at org.gradle.api.internal.project.DefaultProject.evaluate(DefaultProject.java:762)
	at org.gradle.api.internal.project.DefaultProject.evaluate(DefaultProject.java:153)
	at org.gradle.api.internal.project.ProjectLifecycleController.lambda$ensureSelfConfigured$1(ProjectLifecycleController.java:63)
	at org.gradle.internal.model.StateTransitionController.lambda$doTransition$12(StateTransitionController.java:236)
	at org.gradle.internal.model.StateTransitionController.doTransition(StateTransitionController.java:247)
	at org.gradle.internal.model.StateTransitionController.doTransition(StateTransitionController.java:235)
	at org.gradle.internal.model.StateTransitionController.lambda$maybeTransitionIfNotCurrentlyTransitioning$9(StateTransitionController.java:196)
	at org.gradle.internal.work.DefaultSynchronizer.withLock(DefaultSynchronizer.java:34)
	at org.gradle.internal.model.StateTransitionController.maybeTransitionIfNotCurrentlyTransitioning(StateTransitionController.java:192)
	at org.gradle.api.internal.project.ProjectLifecycleController.ensureSelfConfigured(ProjectLifecycleController.java:63)
	at org.gradle.api.internal.project.DefaultProjectStateRegistry$ProjectStateImpl.ensureConfigured(DefaultProjectStateRegistry.java:334)
	at org.gradle.execution.TaskPathProjectEvaluator.configure(TaskPathProjectEvaluator.java:33)
	at org.gradle.execution.TaskPathProjectEvaluator.configureHierarchy(TaskPathProjectEvaluator.java:49)
	at org.gradle.configuration.DefaultProjectsPreparer.prepareProjects(DefaultProjectsPreparer.java:50)
	at org.gradle.configuration.BuildTreePreparingProjectsPreparer.prepareProjects(BuildTreePreparingProjectsPreparer.java:64)
	at org.gradle.configuration.BuildOperationFiringProjectsPreparer$ConfigureBuild.run(BuildOperationFiringProjectsPreparer.java:52)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:29)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$1.execute(DefaultBuildOperationRunner.java:26)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.run(DefaultBuildOperationRunner.java:47)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:68)
	at org.gradle.configuration.BuildOperationFiringProjectsPreparer.prepareProjects(BuildOperationFiringProjectsPreparer.java:40)
	at org.gradle.initialization.VintageBuildModelController.lambda$prepareProjects$2(VintageBuildModelController.java:84)
	at org.gradle.internal.model.StateTransitionController.lambda$doTransition$12(StateTransitionController.java:236)
	at org.gradle.internal.model.StateTransitionController.doTransition(StateTransitionController.java:247)
	at org.gradle.internal.model.StateTransitionController.doTransition(StateTransitionController.java:235)
	at org.gradle.internal.model.StateTransitionController.lambda$transitionIfNotPreviously$10(StateTransitionController.java:210)
	at org.gradle.internal.work.DefaultSynchronizer.withLock(DefaultSynchronizer.java:34)
	at org.gradle.internal.model.StateTransitionController.transitionIfNotPreviously(StateTransitionController.java:206)
	at org.gradle.initialization.VintageBuildModelController.prepareProjects(VintageBuildModelController.java:84)
	at org.gradle.initialization.VintageBuildModelController.prepareToScheduleTasks(VintageBuildModelController.java:71)
	at org.gradle.internal.build.DefaultBuildLifecycleController.lambda$prepareToScheduleTasks$2(DefaultBuildLifecycleController.java:129)
	at org.gradle.internal.model.StateTransitionController.lambda$doTransition$12(StateTransitionController.java:236)
	at org.gradle.internal.model.StateTransitionController.doTransition(StateTransitionController.java:247)
	at org.gradle.internal.model.StateTransitionController.doTransition(StateTransitionController.java:235)
	at org.gradle.internal.model.StateTransitionController.lambda$maybeTransition$8(StateTransitionController.java:187)
	at org.gradle.internal.work.DefaultSynchronizer.withLock(DefaultSynchronizer.java:34)
	at org.gradle.internal.model.StateTransitionController.maybeTransition(StateTransitionController.java:183)
	at org.gradle.internal.build.DefaultBuildLifecycleController.prepareToScheduleTasks(DefaultBuildLifecycleController.java:127)
	at org.gradle.internal.buildtree.DefaultBuildTreeWorkPreparer.scheduleRequestedTasks(DefaultBuildTreeWorkPreparer.java:36)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.lambda$doScheduleAndRunTasks$3(DefaultBuildTreeLifecycleController.java:96)
	at org.gradle.composite.internal.DefaultIncludedBuildTaskGraph.withNewWorkGraph(DefaultIncludedBuildTaskGraph.java:109)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.doScheduleAndRunTasks(DefaultBuildTreeLifecycleController.java:95)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.lambda$scheduleAndRunTasks$1(DefaultBuildTreeLifecycleController.java:76)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.lambda$runBuild$5(DefaultBuildTreeLifecycleController.java:113)
	at org.gradle.internal.model.StateTransitionController.lambda$transition$5(StateTransitionController.java:166)
	at org.gradle.internal.model.StateTransitionController.doTransition(StateTransitionController.java:247)
	at org.gradle.internal.model.StateTransitionController.lambda$transition$6(StateTransitionController.java:166)
	at org.gradle.internal.work.DefaultSynchronizer.withLock(DefaultSynchronizer.java:44)
	at org.gradle.internal.model.StateTransitionController.transition(StateTransitionController.java:166)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.runBuild(DefaultBuildTreeLifecycleController.java:110)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.scheduleAndRunTasks(DefaultBuildTreeLifecycleController.java:76)
	at org.gradle.internal.buildtree.DefaultBuildTreeLifecycleController.scheduleAndRunTasks(DefaultBuildTreeLifecycleController.java:71)
	at org.gradle.tooling.internal.provider.ExecuteBuildActionRunner.run(ExecuteBuildActionRunner.java:31)
	at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
	at org.gradle.internal.buildtree.ProblemReportingBuildActionRunner.run(ProblemReportingBuildActionRunner.java:49)
	at org.gradle.launcher.exec.BuildOutcomeReportingBuildActionRunner.run(BuildOutcomeReportingBuildActionRunner.java:65)
	at org.gradle.tooling.internal.provider.FileSystemWatchingBuildActionRunner.run(FileSystemWatchingBuildActionRunner.java:136)
	at org.gradle.launcher.exec.BuildCompletionNotifyingBuildActionRunner.run(BuildCompletionNotifyingBuildActionRunner.java:41)
	at org.gradle.launcher.exec.RootBuildLifecycleBuildActionExecutor.lambda$execute$0(RootBuildLifecycleBuildActionExecutor.java:40)
	at org.gradle.composite.internal.DefaultRootBuildState.run(DefaultRootBuildState.java:122)
	at org.gradle.launcher.exec.RootBuildLifecycleBuildActionExecutor.execute(RootBuildLifecycleBuildActionExecutor.java:40)
	at org.gradle.internal.buildtree.DefaultBuildTreeContext.execute(DefaultBuildTreeContext.java:40)
	at org.gradle.launcher.exec.BuildTreeLifecycleBuildActionExecutor.lambda$execute$0(BuildTreeLifecycleBuildActionExecutor.java:65)
	at org.gradle.internal.buildtree.BuildTreeState.run(BuildTreeState.java:53)
	at org.gradle.launcher.exec.BuildTreeLifecycleBuildActionExecutor.execute(BuildTreeLifecycleBuildActionExecutor.java:65)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor$3.call(RunAsBuildOperationBuildActionExecutor.java:61)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor$3.call(RunAsBuildOperationBuildActionExecutor.java:57)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:204)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$CallableBuildOperationWorker.execute(DefaultBuildOperationRunner.java:199)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:66)
	at org.gradle.internal.operations.DefaultBuildOperationRunner$2.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:157)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.execute(DefaultBuildOperationRunner.java:59)
	at org.gradle.internal.operations.DefaultBuildOperationRunner.call(DefaultBuildOperationRunner.java:53)
	at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:73)
	at org.gradle.launcher.exec.RunAsBuildOperationBuildActionExecutor.execute(RunAsBuildOperationBuildActionExecutor.java:57)
	at org.gradle.launcher.exec.RunAsWorkerThreadBuildActionExecutor.lambda$execute$0(RunAsWorkerThreadBuildActionExecutor.java:36)
	at org.gradle.internal.work.DefaultWorkerLeaseService.withLocks(DefaultWorkerLeaseService.java:249)
	at org.gradle.internal.work.DefaultWorkerLeaseService.runAsWorkerThread(DefaultWorkerLeaseService.java:109)
	at org.gradle.launcher.exec.RunAsWorkerThreadBuildActionExecutor.execute(RunAsWorkerThreadBuildActionExecutor.java:36)
	at org.gradle.tooling.internal.provider.continuous.ContinuousBuildActionExecutor.execute(ContinuousBuildActionExecutor.java:110)
	at org.gradle.tooling.internal.provider.SubscribableBuildActionExecutor.execute(SubscribableBuildActionExecutor.java:64)
	at org.gradle.internal.session.DefaultBuildSessionContext.execute(DefaultBuildSessionContext.java:46)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter$ActionImpl.apply(BuildSessionLifecycleBuildActionExecuter.java:100)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter$ActionImpl.apply(BuildSessionLifecycleBuildActionExecuter.java:88)
	at org.gradle.internal.session.BuildSessionState.run(BuildSessionState.java:69)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter.execute(BuildSessionLifecycleBuildActionExecuter.java:62)
	at org.gradle.tooling.internal.provider.BuildSessionLifecycleBuildActionExecuter.execute(BuildSessionLifecycleBuildActionExecuter.java:41)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:63)
	at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:31)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:52)
	at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:40)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:47)
	at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:31)
	at org.gradle.launcher.daemon.server.exec.ExecuteBuild.doBuild(ExecuteBuild.java:65)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.WatchForDisconnection.execute(WatchForDisconnection.java:39)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ResetDeprecationLogger.execute(ResetDeprecationLogger.java:29)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.RequestStopIfSingleUsedDaemon.execute(RequestStopIfSingleUsedDaemon.java:35)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:78)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:75)
	at org.gradle.util.internal.Swapper.swap(Swapper.java:38)
	at org.gradle.launcher.daemon.server.exec.ForwardClientInput.execute(ForwardClientInput.java:75)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogAndCheckHealth.execute(LogAndCheckHealth.java:55)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.LogToClient.doBuild(LogToClient.java:63)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.EstablishBuildEnvironment.doBuild(EstablishBuildEnvironment.java:84)
	at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
	at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
	at org.gradle.launcher.daemon.server.exec.StartBuildOrRespondWithBusy$1.run(StartBuildOrRespondWithBusy.java:52)
	at org.gradle.launcher.daemon.server.DaemonStateCoordinator$1.run(DaemonStateCoordinator.java:297)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:49)
Caused by: java.lang.ClassNotFoundException: org.jetbrains.kotlin.gradle.tasks.KotlinCompile
	... 211 more


* Get more help at https://help.gradle.org

BUILD FAILED in 1s
6 actionable tasks: 6 executed
```
</details>
