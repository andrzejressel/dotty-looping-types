Note: Implementation.java HAS TO BE IN ANOTHER PROJECT. My guess is that bug is related to parsing class files

```
[IJ]compile
[info] compiling 1 Java source to D:\MojeProgramy\scala33-crash\lib\target\scala-3.3.0\classes ...
[info] done compiling
[info] compiling 1 Scala source to D:\MojeProgramy\scala33-crash\target\scala-3.3.0\classes ...
exception caught when loading class Inner: Cyclic reference involving object Implementation
exception caught when loading module class Implementation$: Cyclic reference involving object Implementation
dotty.tools.dotc.core.CyclicReference: Cyclic reference involving object Implementation while running checkUnusedPostTyper on D:\MojeProgramy\scala33-crash\src\main\scala\Crash.scala
[info] exception occurred while compiling D:\MojeProgramy\scala33-crash\src\main\scala\Crash.scala
[error] ## Exception when compiling 1 sources to D:\MojeProgramy\scala33-crash\target\scala-3.3.0\classes
[error] java.lang.AssertionError: assertion failed: denotation object Implementation invalid in run 1. ValidFor: Period(1..7, run = 2)
[error] scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
[error] dotty.tools.dotc.core.Denotations$SingleDenotation.updateValidity(Denotations.scala:718)
[error] dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:743)
[error] dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:800)
[error] dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:871)
[error] dotty.tools.dotc.core.Symbols$Symbol.recomputeDenot(Symbols.scala:120)
[error] dotty.tools.dotc.core.Symbols$Symbol.computeDenot(Symbols.scala:114)
[error] dotty.tools.dotc.core.Symbols$Symbol.denot(Symbols.scala:107)
[error] dotty.tools.dotc.core.Symbols$.toDenot(Symbols.scala:494)
[error] dotty.tools.dotc.core.CyclicReference.toMessage(TypeErrors.scala:142)
[error] dotty.tools.dotc.Driver.doCompile(Driver.scala:41)
[error] dotty.tools.xsbt.CompilerBridgeDriver.run(CompilerBridgeDriver.java:88)
[error] dotty.tools.xsbt.CompilerBridge.run(CompilerBridge.java:22)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:91)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$7(MixedAnalyzingCompiler.scala:193)
[error] scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error] sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:248)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4(MixedAnalyzingCompiler.scala:183)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4$adapted(MixedAnalyzingCompiler.scala:163)
[error] sbt.internal.inc.JarUtils$.withPreviousJar(JarUtils.scala:239)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:163)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:211)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:534)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:534)
[error] sbt.internal.inc.Incremental$.$anonfun$apply$5(Incremental.scala:179)
[error] sbt.internal.inc.Incremental$.$anonfun$apply$5$adapted(Incremental.scala:177)
[error] sbt.internal.inc.Incremental$$anon$2.run(Incremental.scala:463)
[error] sbt.internal.inc.IncrementalCommon$CycleState.next(IncrementalCommon.scala:116)
[error] sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:56)
[error] sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:52)
[error] sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:263)
[error] sbt.internal.inc.Incremental$.$anonfun$incrementalCompile$8(Incremental.scala:418)
[error] sbt.internal.inc.Incremental$.withClassfileManager(Incremental.scala:505)
[error] sbt.internal.inc.Incremental$.incrementalCompile(Incremental.scala:405)
[error] sbt.internal.inc.Incremental$.apply(Incremental.scala:171)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:534)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:488)
[error] sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:332)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:425)
[error] sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:137)
[error] sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:2363)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$2(Defaults.scala:2313)
[error] sbt.internal.server.BspCompileTask$.$anonfun$compute$1(BspCompileTask.scala:30)
[error] sbt.internal.io.Retry$.apply(Retry.scala:46)
[error] sbt.internal.io.Retry$.apply(Retry.scala:28)
[error] sbt.internal.io.Retry$.apply(Retry.scala:23)
[error] sbt.internal.server.BspCompileTask$.compute(BspCompileTask.scala:30)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:2311)
[error] scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error] sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error] sbt.std.Transform$$anon$4.work(Transform.scala:68)
[error] sbt.Execute.$anonfun$submit$2(Execute.scala:282)
[error] sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
[error] sbt.Execute.work(Execute.scala:291)
[error] sbt.Execute.$anonfun$submit$1(Execute.scala:282)
[error] sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error] sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
[error] java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
[error] java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
[error] java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
[error] java.base/java.lang.Thread.run(Thread.java:833)
[error]
[error] stack trace is suppressed; run 'last Compile / compileIncremental' for the full output
[error] (Compile / compileIncremental) java.lang.AssertionError: assertion failed: denotation object Implementation invalid in run 1. ValidFor: Period(1..7, run = 2)
[error] Total time: 1 s, completed 4 cze 2023, 17:36:10
[IJ]
```