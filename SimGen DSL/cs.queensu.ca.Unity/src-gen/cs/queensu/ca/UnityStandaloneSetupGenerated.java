/*
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cs.queensu.ca.unity.UnityPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class UnityStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new UnityRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.queensu.cs/ca/Unity")) {
			EPackage.Registry.INSTANCE.put("http://www.queensu.cs/ca/Unity", UnityPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("prototype", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("prototype", serviceProvider);
	}
}
