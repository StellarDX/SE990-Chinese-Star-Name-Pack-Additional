// 角宿增五(**)
Star	"HD 118511 A"
{
	ParentBody     "HD 118511"
	Class          "K0III"

	BinaryOrbit
	{
		Separation      780.1
	}
}

Star	"HD 118511 B"
{
	ParentBody     "HD 118511"
	Class          "A4.4 V"

	BinaryOrbit
	{
		Separation      780.1
	}
}

// 角宿增七(**)
Star	"HD 119853 A"
{
	ParentBody     "HD 119853"
	Class          "G8III"
  RadSol         11.97
  Luminosity     104.7
  Teff           5074

	BinaryOrbit
	{
		Separation      145.887
	}
}

Star	"HD 119853 B"
{
	ParentBody     "HD 119853"
	Class          "M0.5 V"

	BinaryOrbit
	{
		Separation      145.887
	}
}

// 天田增二(**)
Star	"HD 116235 A"
{
	ParentBody     "HD 116235"
	Class          "A3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1454.82544
		Eccentricity    0.214890361
		Inclination     1.48115289
		AscendingNode   0
		ArgOfPericenter 33.8976347
		MeanAnomaly     -133.787604
	}
}

Star	"HD 116235 B"
{
	ParentBody     "HD 116235"
	Class          "F3.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1454.82544
		Eccentricity    0.214890361
		Inclination     1.48115289
		AscendingNode   0
		ArgOfPericenter 213.897635
		MeanAnomaly     -133.787604
	}
}

// 天田增三(PM**)
Star	"HD 119425 A"
{
	ParentBody     "HD 119425"
	Class          "G8III"
	RadSol         8.83
	Luminosity     51.17
	Teff           4682

	Orbit
	{
		RefPlane        "Equator"
		Period          0.01921798817
		Eccentricity    0
		Inclination     1.20196414
		AscendingNode   0
		ArgOfPericenter 37.0321273
		MeanAnomaly     -70.293596
	}
}

Star	"HD 119425 B"
{
	ParentBody     "HD 119425"
	Class          "G3IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.01921798817
		Eccentricity    0
		Inclination     1.20196414
		AscendingNode   0
		ArgOfPericenter 217.032127
		MeanAnomaly     -70.293596
	}
}

// 进贤增一(*Pl)
Remove "38 Vir b"{ParentBody "HD 111998"}
Planet	"HIP 62875 b"
{
	ParentBody     "HIP 62875"
	DiscMethod     "RadVel"
	DiscDate       "2016" // 2016.08.29
	Mass           1433.4059938
	Radius         322428.92
	Oblateness     0

	Orbit
	{
		SemiMajorAxis   1.82
		Eccentricity    0.03
		PeriodDays      825.9
		Epoch           2455490.2
		ArgOfPericen    -87.3
		MeanAnomaly     0
	}
}

// 进贤增三(**)
Star	"HD 112992 A"
{
	ParentBody     "HD 112992"
	Class          "K1III"

	BinaryOrbit
	{
		Separation      85.5359
	}
}

Star	"HD 112992 B"
{
	ParentBody     "HD 112992"
	Class          "M1.8 V"

	BinaryOrbit
	{
		Separation      85.5359
	}
}

// 进贤增四(**)
Star	"HD 113459 A"
{
	ParentBody     "HD 113459"
	Class          "A9IV"

	BinaryOrbit
	{
		Separation      83.7499
	}
}

Star	"HD 113459 B"
{
	ParentBody     "HD 113459"
	Class          "G4.7 V"

	BinaryOrbit
	{
		Separation      83.7499
	}
}

// 进贤增五(LP**)
Star	"HD 112142 A"
{
	ParentBody     "HD 112142"
	Class          "M3IIICa-1"
	Luminosity     1448
	Teff           3687

	BinaryOrbit
	{
		Separation      6.67276
	}
}

Star	"HD 112142 B"
{
	ParentBody     "HD 112142"
	Class          "A2.7 V"

	BinaryOrbit
	{
		Separation      6.67276
	}
}

// 进贤增八(*Pl2)
Remove "HD 110014 b"{ParentBody "HD 110014"}
Remove "HD 110014 c"{ParentBody "HD 110014"}
Planet	"HIP 61740 b"
{
	ParentBody     "HIP 61740"
	DiscMethod     "RadVel"
	DiscDate       "2009" // De Medeiros et al., 2009.07
	Mass           3524.7167342

	Orbit
	{
		//aphelion distance 3.13
		PericenterDist  1.15
		SemiMajorAxis   2.14
		Eccentricity    0.462
		PeriodDays      835.477
		ArgOfPericenter 290.6
		MeanAnomaly     0
	}
}

Planet	"HIP 61740 c"
{
	ParentBody     "HIP 61740"
	DiscDate       "2015" // Maritza Soto, 2015.08.19
	//Mass           953.48514
	Radius         214476 // three times bigger than Jupiter
	Oblateness     0

	Orbit // having an orbit roughly that of Venus
	{
		//AnalyticModel  "Venus-VSOP87"
		RefPlane       "Ecliptic"
		//Period          0.6152
		SemiMajorAxis   0.7233
		Eccentricity    0.0068
		Inclination     3.3947
		AscendingNode   76.681
		LongOfPericen   131.533
		MeanLongitude   181.979
	}
}

// 天门增三(**)
Star	"HIP 64520 A"
{
	ParentBody     "HIP 64520"
	Class          "B9V"

	BinaryOrbit
	{
		Separation      2131.89
	}
}

Star	"HIP 64520 B"
{
	ParentBody     "HIP 64520"
	Class          "A2VpSr"

	BinaryOrbit
	{
		Separation      2131.89
	}
}

// 天门增四(*Pl3)
Remove "61 Vir b"{ParentBody "61 Vir"}
Remove "61 Vir c"{ParentBody "61 Vir"}
Remove "61 Vir d"{ParentBody "61 Vir"}
Star	"61 Vir A"
{
	ParentBody     "61 Vir"
	Class          "G7V"
	AppMagnB       5.45
	AppMagnJ       3.334
	AppMagnH       2.974
	AppMagnK       2.956

	MassSol        0.93
	RadSol         0.9867
	Luminosity     0.8222
	Teff           5538
	FeH            -0.02
	Age            6.1

	Obliquity      5 // 77 - 72

	Orbit
	{
		RefPlane        "Static"
		Inclination     77
	}
}

Planet	"61 Vir b"
{
	ParentBody     "61 Vir A"
	DiscMethod     "RadVel"
	DiscDate       "2009" // Vogt et al., Keck Observatory, Anglo-Australian Observatory, 2009.12.14
	Class          "Terra" // super-Earth
	Radius         10205.024
	Mass           5.1
	Teff           1054

	Orbit
	{
		RefPlane        "Ecliptic"
		//aphelion distance 0.056163
		PericenterDist  0.044239
		SemiMajorAxis   0.050201
		Eccentricity    0.12
		PeriodDays      4.2150
		Epoch           2453369.166
		LongOfPericen   105
		MeanLongitude   105
	}
}

Planet	"61 Vir c"
{
	ParentBody     "61 Vir A"
	DiscMethod     "RadVel"
	DiscDate       "2009" // Vogt et al., Keck Observatory, Anglo-Australian Observatory, 2009.12.14
	Class          "IceGiant" // a gas giant like Uranus and Neptune.
	Mass           18.8

	Orbit
	{
		RefPlane        "Ecliptic"
		//aphelion distance 0.2487
		PericenterDist  0.1863
		SemiMajorAxis   0.2175
		Eccentricity    0.14
		PeriodDays      38.021
		Epoch           2453369.166
		LongOfPericen   341
		MeanLongitude   341
	}
}

Planet	"61 Vir d"
{
	ParentBody     "61 Vir A"
	DiscMethod     "RadVel"
	DiscDate       "2009" // Vogt et al., Keck Observatory, Anglo-Australian Observatory, 2009.12.14
	Class          "IceGiant" // a gas giant like Uranus and Neptune.
	Mass           23.7

	Orbit
	{
		RefPlane        "Ecliptic"
		//aphelion distance 0.640
		PericenterDist  0.311
		SemiMajorAxis   0.476
		Eccentricity    0.35
		PeriodDays      123.01
		Epoch           2453369.166
		LongOfPericen   314
		MeanLongitude   314
	}
}

// 平增一(**?)
Star	"HD 114149 A"
{
	ParentBody     "HD 114149"
	Class          "K0III"
	RadSol         10.6
	Luminosity     56
	Teff           4680
	FeH            -0.19

	Orbit
	{
		RefPlane        "Equator"
		Period          0.208918761
		Eccentricity    0.400896043
		Inclination     2.13542724
		AscendingNode   0
		ArgOfPericenter -155.148361
		MeanAnomaly     -74.6034816
	}
}

Star	"HD 114149 B"
{
	ParentBody     "HD 114149"
	Class          "A7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.208918761
		Eccentricity    0.400896043
		Inclination     2.13542724
		AscendingNode   0
		ArgOfPericenter 24.8516391
		MeanAnomaly     -74.6034816
	}
}

// 南门增二(a2*)
// 没法确认是不是多星
Remove "ALF Cir A"{ParentBody "ALF Cir"}
Remove "ALF Cir B"{ParentBody "ALF Cir"}
