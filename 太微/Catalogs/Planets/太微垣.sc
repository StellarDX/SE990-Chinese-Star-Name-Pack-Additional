// 五帝座增一(**)
Star "HD 100600 A"
{
	ParentBody "HD 100600"
	Class      "B6.6IV"

	BinaryOrbit
	{
		Separation      2122.8
	}
}

Star "HD 100600 B"
{
	ParentBody "HD 100600"
	Class      "B3.7V"

	BinaryOrbit
	{
		Separation      2122.8
	}
}

// 五帝座增三(**)
Remove "88 Leo A"{ParentBody "88 Leo"}
Remove "88 Leo B"{ParentBody "88 Leo"}
Star "HD 100180 A/AG+14 1209/GJ 3669/SAO 99648/LTT 13145 A"
{
	ParentBody "HD 100180"
	Class      "F9.5V"
	MassSol    1.06
  RadSol     1.1
  Luminosity 1.47
  Teff       6060
  FeH        -0.06
  RotationPeriod 343.68
  Age        5.7

	Orbit
	{
		Period          6650.88857994 // 360.6
		Eccentricity    0.2
		Inclination     58
		AscendingNode   138
		ArgOfPericenter 100
		Epoch           2169577.555939
		MeanAnomaly     0
	}
}

Star "HD 100180 B/AG+14 1208/GJ 3670/SAO 99647/LTT 13146 B"
{
	ParentBody "HD 100180"
	Class      "G5V"
  MassSol    0.74

	Orbit
	{
		Period          6650.88857994
		Eccentricity    0.2
		Inclination     58
		AscendingNode   138
		ArgOfPericenter 280
		Epoch           2169577.555939
		MeanAnomaly     0
	}
}

// 五诸侯增二(SB****)
Barycenter "HD 112033 A"
{
	ParentBody "35 Com"
	Orbit
	{
		Period          539.4
		Eccentricity    0.208
		Inclination     28.4
		AscendingNode   238.7
		Epoch           2433063.27813978
		ArgOfPericenter 71.6
		MeanAnomaly     0
	}
}

Star "HD 112033 Aa"
{
	ParentBody "HD 112033 A"
	Class      "G5III"

	Orbit
	{
		Period          7.9624
		Eccentricity    0.63
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 112033 Ab"
{
	ParentBody "HD 112033 A"
	Class      "K1 V"

	Orbit
	{
		Period          7.9624
		Eccentricity    0.63
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 112033 B"
{
	ParentBody "35 Com"
	Class      "F1V"

	Orbit
	{
		Period          539.4
		Eccentricity    0.208
		Inclination     28.4
		AscendingNode   238.7
		Epoch           2433063.27813978
		ArgOfPericenter 251.6
		MeanAnomaly     0
	}
}

Star "HD 112033 C"
{
	ParentBody "35 Com"
	Class      "G6.3 V"

	Orbit
	{
		SemiMajorAxis   2523 // 29"
	}
}

// 五诸侯增五(SB***)
Star "24 Com A/NSV 5748/GC 17147/HD 109511/HIP 61418/HR 4792/SAO 100160"
{
	ParentBody "24 Com"
	Class      "K0II"
	MassSol    4.4
	RadSol     19.95
	Luminosity 173.3
	Teff       4688
	FeH        -0.09

	Orbit
	{
		Period          28000
		SemiMajorAxis   600
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "五诸侯增五/24 Com B/GC 17146/HD 109510/HIP 61415/HR 4791/SAO 100159"
{
	ParentBody "24 Com"
	Orbit
	{
		Period          28000
		SemiMajorAxis   800
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 109510 Ba"
{
	ParentBody "HD 109510"
	Class      "A9V"
	MassSol    1.78
	RadSol     2.91
	Luminosity 23.9
	Teff       7476

	Orbit
	{
		PeriodDays      7.3361
		Eccentricity    0.26
		Epoch           2444593.29
		ArgOfPericenter 120
		MeanAnomaly     0
		//SemiAmplitude   68.7
	}
}

Star "HD 109510 Bb"
{
	ParentBody "HD 109510"
	Class      ""
	MassSol    1.52

	Orbit
	{
		PeriodDays      7.3361
		Eccentricity    0.26
		Epoch           2444593.29
		ArgOfPericenter 300
		MeanAnomaly     0
		//SemiAmplitude   80.6
	}
}

// 五诸侯增六(PM**Pl)
Remove "11 Com A"{ParentBody "11 Com"}
Remove "11 Com B"{ParentBody "11 Com"}
Star "HD 107383 A"
{
	ParentBody "HD 107383"
	Class      "K0III"
	MassSol    1.66
	RadSol     15.781
	Luminosity 109.51
	Teff       4670
	FeH        -0.51
	Age        1.53

	Orbit
	{
		Epoch           2454101.22878957
		Separation      818.4 // 8.8"
		PositionAngle   44
	}
}

Star "HD 107383 B"
{
	ParentBody "HD 107383"
	Class      "A2.1 V"

	Orbit
	{
		Epoch           2454101.22878957
		Separation      818.4 // 8.8"
		PositionAngle   44
	}
}

//////////ExoPlanets//////////
Remove "11 Com A b"{ParentBody "11 Com A"}
Planet	"HD 107383 A b"
{
	ParentBody     "HD 107383 A"
	DiscMethod     "RadVel"
	DiscDate       "2007"
	Mass           6165.870572

	Orbit
	{
		SemiMajorAxis   1.29
		PeriodDays      326.03
		Eccentricity    0.231
	}
}

// 内屏增二(**)
Star	"HD 102510 A"
{
	ParentBody     "HD 102510"
	Class          "A1V"

	Orbit
	{
		RefPlane        "Equator"
		Period          186.080989
		Eccentricity    0.529813528
		Inclination     0.101423502
		AscendingNode   0
		ArgOfPericenter -55.1123317
		MeanAnomaly     -143.887187
	}
}

Star	"HD 102510 B"
{
	ParentBody     "HD 102510"
	Class          "K0 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          186.080989
		Eccentricity    0.529813528
		Inclination     0.101423502
		AscendingNode   0
		ArgOfPericenter 124.887668
		MeanAnomaly     -143.887187
	}
}

// 西次相增三(SB**)
Star	"HD 97907 A"
{
	ParentBody     "HD 97907"
	Class          "K2III"

	Orbit
	{
		RefPlane        "Equator"
		Period          2760.08373
		Eccentricity    0.472000748
		Inclination     2.08192497
		AscendingNode   0
		ArgOfPericenter 92.8624045
		MeanAnomaly     -124.744123
	}
}

Star	"HD 97907 B"
{
	ParentBody     "HD 97907"
	Class          "F2.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2760.08373
		Eccentricity    0.472000748
		Inclination     2.08192497
		AscendingNode   0
		ArgOfPericenter 272.862405
		MeanAnomaly     -124.744123
	}
}

// 东次将增三(PM*Pl)
Planet	"HD 115383 b"
{
	ParentBody     "HD 115383"
	DiscMethod     "Imaging" // Direct imaging
	DiscDate       "2013" // Kuzuhara et al., Subaru Telescope, 2013
	Class          "BrownDwarf"
	SpecClass      "T8" // T - Y
	Mass           6356.5676 // 20 - 30? 4?
	Radius         68632.32 // 0.96RJ
	Teff           544
	Age            2.5 // 4.5? 0.16?

	Surface
	{
		Preset         "jupiter_frigid_default.cfg"
	}

	Orbit
	{
		SemiMajorAxis   43.5 // 31 - 129
		Eccentricity    0.01 // 0.01 - 0.62
		PeriodDays      155 // 155 - 1332
		Inclination     111 // 111 - 171
		AscendingNode   8 //8 - 173
		Epoch           2453396.31134592 // 2005.07 - 2825.03
		ArgOfPericenter 4 // 4 - 176
		MeanAnomaly     0
	}
}

// 东上将增一(PM**)
Star	"HD 117176 A"
{
	ParentBody     "HD 117176"
	Class          "G4V"
	MassSol        1.12
	RadSol         1.9
	Luminosity     2.92
	Teff           5406
	FeH            -0.06
	Age            7.9

	BinaryOrbit
	{
		Separation      51.2226
	}
}

Star	"HD 117176 B"
{
	ParentBody     "HD 117176"
	Class          "M5V"
	MassSol        0.08

	BinaryOrbit
	{
		Separation      51.2226
	}
}

//////////ExoPlanets//////////
Remove "70 Vir b"{ParentBody "70 Vir"}
Planet	"HD 117176 b"
{
	ParentBody     "HD 117176 A"
	DiscMethod     "Astrometry" // Doppler Spectroscopy
	DiscDate       "1996" // Geoffrey Marcy, R. Paul Butler, USA, 1996.01.17
	Mass           2383.71285

	Orbit
	{
		SemiMajorAxis   0.484
		Eccentricity    0.4007
		PeriodDays      116.6884
		Epoch           2447239.82
		ArgOfPericen    358.71
		MeanAnomaly     0
	}
}

// 郎将增一(**)
Star	"HD 111469 A"
{
	ParentBody     "HD 111469"
	Class          "A2V"

	Orbit
	{
		RefPlane        "Equator"
		Period          922.400648
		Eccentricity    0.53676188
		Inclination     2.41262899
		AscendingNode   0
		ArgOfPericenter -151.932693
		MeanAnomaly     61.1967757
	}
}

Star	"HD 111469 B"
{
	ParentBody     "HD 111469"
	Class          "K4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          922.400648
		Eccentricity    0.53676188
		Inclination     2.41262899
		AscendingNode   0
		ArgOfPericenter 28.067307
		MeanAnomaly     61.1967757
	}
}

// 郎位增三(SB**)
Star	"HD 105981 A"
{
	ParentBody     "HD 105981"
	Class          "K5III"

	Orbit
	{
		RefPlane        "Equator"
		Period          28.3645835
		Eccentricity    0.741780519
		Inclination     1.32921946
		AscendingNode   0
		ArgOfPericenter -17.1666189
		MeanAnomaly     -95.7659766
	}
}

Star	"HD 105981 B"
{
	ParentBody     "HD 105981"
	Class          "F4.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          28.3645835
		Eccentricity    0.741780519
		Inclination     1.32921946
		AscendingNode   0
		ArgOfPericenter 162.833381
		MeanAnomaly     -95.7659766
	}
}

// 常陈增一(dS**)
Star	"HD 107904 A"
{
	ParentBody     "HD 107904"
	Class          "F3III"
	MassSol        1
	RadSol         3.7
	Luminosity     295
	Teff           6875
	FeH            -0.05

	Orbit
	{
		PeriodDays      124.44
		Eccentricity    0.311
		Epoch           2454605
		ArgOfPericenter 250.2
		MeanAnomaly     0
		//SemiAmplitude   13.24
	}
}

Star	"HD 107904 B"
{
	ParentBody     "HD 107904"
	Class          "A8.5 V"

	Orbit
	{
		PeriodDays      124.44
		Eccentricity    0.311
		Epoch           2454605
		ArgOfPericenter 70.2
		MeanAnomaly     0
	}
}

// 常陈增五(**+?)
Star	"HD 114376 A"
{
	ParentBody     "HD 114376"
	Class          "B7III"
	AppMagn        6.28

	Orbit
	{
		RefPlane        "Equator"
		Period          409.004423
		Eccentricity    0.36979264
		Inclination     2.3192988
		AscendingNode   0
		ArgOfPericenter -7.06298925
		MeanAnomaly     125.057676
	}
}

Barycenter	"HD 114376 B"
{
	ParentBody     "HD 114376"
	Orbit
	{
		RefPlane        "Equator"
		Period          409.004423
		Eccentricity    0.36979264
		Inclination     2.3192988
		AscendingNode   0
		ArgOfPericenter 172.937011
		MeanAnomaly     125.057676
	}
}

Star	"HD 114376 BA"
{
	ParentBody     "HD 114376 B"
	Class          "A4.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.137559384
		Eccentricity    0.357070237
		Inclination     -0.927797318
		AscendingNode   0
		ArgOfPericenter -134.96316
		MeanAnomaly     47.3448341
	}
}

Star	"HD 114376 BB"
{
	ParentBody     "HD 114376 B"
	Class          "F3.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.137559384
		Eccentricity    0.357070237
		Inclination     -0.927797318
		AscendingNode   0
		ArgOfPericenter 45.0368398
		MeanAnomaly     47.3448341
	}
}

// 上台增七(PM*Pl)
Remove "Arkas"{ParentBody "Intercrus"}
Planet	"HIP 46471 b"
{
	ParentBody     "HIP 46471"
	DiscMethod     "RadVel"
	DiscDate       "2008" // Sato et al., Okayama Planet Search Program, Japan, 2008.02.19
	Mass           858.136626

	Orbit
	{
		SemiMajorAxis   0.81
		Eccentricity    0
		PeriodDays      184.02
		Epoch           2452335.4
		ArgOfPericen    0
	}
}

// 下台增二(SB**)
Star	"HD 101606 A"
{
	ParentBody     "HD 101606"
	Class          "F5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2.40853707
		Eccentricity    0.0289935321
		Inclination     -0.437607527
		AscendingNode   0
		ArgOfPericenter 32.4499975
		MeanAnomaly     45.0642841
	}
}

Star	"HD 101606 B"
{
	ParentBody     "HD 101606"
	Class          "K2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2.40853707
		Eccentricity    0.0289935321
		Inclination     -0.437607527
		AscendingNode   0
		ArgOfPericenter 212.449997
		MeanAnomaly     45.0642841
	}
}

// 少微增二(**?)
Star	"HD 92769 A"
{
	ParentBody     "HD 92769"
	Class          "A4Vn"
	RadSol         1.85
	Luminosity     10.72
	Teff           8017
	FeH            -0.2

	BinaryOrbit
	{
		Separation      856.207
	}
}

Star	"HD 92769 B"
{
	ParentBody     "HD 92769"
	Class          "G5.4 V"

	BinaryOrbit
	{
		Separation      856.207
	}
}

// 少微增七(SB**)
Star	"HD 96528 A"
{
	ParentBody     "HD 96528"
	Class          "A5m"

	Orbit
	{
		RefPlane        "Equator"
		Period          566.548669
		Eccentricity    0.30832997
		Inclination     -0.419272184
		AscendingNode   0
		ArgOfPericenter -29.5938029
		MeanAnomaly     -139.772052
	}
}

Star	"HD 96528 B"
{
	ParentBody     "HD 96528"
	Class          "F6.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          566.548669
		Eccentricity    0.30832997
		Inclination     -0.419272184
		AscendingNode   0
		ArgOfPericenter 150.406197
		MeanAnomaly     -139.772052
	}
}

// 长垣增二(EB***)
Remove "49 Leo A"{ParentBody "49 Leo"}
Remove "49 Leo B"{ParentBody "49 Leo"}
Remove "49 Leo Aa"{ParentBody "49 Leo A"}
Remove "49 Leo Ab"{ParentBody "49 Leo A"}
Barycenter	"HD 91636 A"
{
	ParentBody     "HD 91636"
	Orbit
	{
		Period          2330
		SemiMajorAxis   63.1148812
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 91636 Aa"
{
	ParentBody     "HD 91636 A"
	Class          "A2V"
	MassSol        3.73
	RadSol         4.14
	Luminosity     116
	Teff           9360

	Orbit
	{
		PeriodDays      2.4450566
		Inclination     90 // ?
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 91636 Ab"
{
	ParentBody     "HD 91636 A"
	Class          ""
	MassSol        2.24
	RadSol         4.14
	Luminosity     16.5
	Teff           7490

	Orbit
	{
		PeriodDays      2.4450566
		Inclination     90 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 91636 B"
{
	ParentBody     "HD 91636"
	Class          ""
	MassSol        1.69

	Orbit
	{
		Period          2330
		SemiMajorAxis   222.9561188
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 长垣增六(**+?)
Barycenter	"HD 92749 A"
{
	ParentBody     "HD 92749"
	Orbit
	{
		RefPlane        "Equator"
		Period          1636.64485
		SemiMajorAxis   69.1201983
		Eccentricity    0.623247206
		Inclination     -0.230659008
		AscendingNode   0
		ArgOfPericenter 149.865401
		MeanAnomaly     97.1577026
	}
}

Barycenter	"HD 92749 AA"
{
	ParentBody     "HD 92749 A"
	Orbit
	{
		RefPlane        "Equator"
		Period          3.79192737
		SemiMajorAxis   1.14524766
		Eccentricity    0.0610713959
		Inclination     0.36329174
		AscendingNode   0
		ArgOfPericenter -43.1733875
		MeanAnomaly     -98.5862562
	}
}

Star	"HD 92749 AAA"
{
	ParentBody     "HD 92749 AA"
	Class          "F6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00495893483
		SemiMajorAxis   0.0122668508
		Eccentricity    0
		Inclination     -1.24128151
		AscendingNode   0
		ArgOfPericenter 44.9014369
		MeanAnomaly     35.2348928
	}
}

Star	"HD 92749 AAB"
{
	ParentBody     "HD 92749 AA"
	Class          "K4.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00495893483
		SemiMajorAxis   0.0161949612
		Eccentricity    0
		Inclination     -1.24128151
		AscendingNode   0
		ArgOfPericenter 224.901437
		MeanAnomaly     35.2348928
	}
}

Star	"HD 92749 AB"
{
	ParentBody     "HD 92749 A"
	Class          "K0.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          3.79192737
		SemiMajorAxis   1.32259686
		Eccentricity    0.0610713959
		Inclination     0.36329174
		AscendingNode   0
		ArgOfPericenter 136.826613
		MeanAnomaly     -98.5862562
	}
}

Star	"HD 92749 B"
{
	ParentBody     "HD 92749"
	Class          "G8.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1636.64485
		SemiMajorAxis   76.8628839
		Eccentricity    0.623247206
		Inclination     -0.230659008
		AscendingNode   0
		ArgOfPericenter 329.865401
		MeanAnomaly     97.1577026
	}
}

// 长垣增七(SB**)
Star	"HD 92841 A"
{
	ParentBody     "HD 92841"
	Class          "K2II"
	RadSol         17.84
	Luminosity     189.87
	Teff           4558

	BinaryOrbit
	{
		Separation      1150.84
	}
}

Star	"HD 92841 B"
{
	ParentBody     "HD 92841"
	Class          "K1II"

	BinaryOrbit
	{
		Separation      1150.84
	}
}

// 灵台增五(V**)
Star	"HD 95578 A"
{
	ParentBody     "HD 95578"
	Class          "M0 III"
	RadSol         74.5
	Luminosity     1377.86
	Teff           3864
	FeH            0.07

	Orbit
	{
		RefPlane        "Equator"
		Period          0.254960023
		Eccentricity    0
		Inclination     1.96674955
		AscendingNode   0
		ArgOfPericenter -45.0862209
		MeanAnomaly     -166.806585
	}
}

Star	"HD 95578 B"
{
	ParentBody     "HD 95578"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.254960023
		Eccentricity    0
		Inclination     1.96674955
		AscendingNode   0
		ArgOfPericenter 134.913779
		MeanAnomaly     -166.806585
	}
}

// 灵台增八(RG**)
Star	"HD 96436 A"
{
	ParentBody     "HD 96436"
	Class          "K0III"

	BinaryOrbit
	{
		Separation      168.21
	}
}

Star	"HD 96436 B"
{
	ParentBody     "HD 96436"
	Class          "M2.7 V"

	BinaryOrbit
	{
		Separation      168.21
	}
}

// 谒者增二(PM**)
Remove "17 Vir A"{ParentBody "17 Vir"}
Remove "17 Vir B"{ParentBody "17 Vir"}
Star	"HD 107705 A"
{
	ParentBody     "HD 107705"
	Class          "F8V"
	MassSol        1.22
	RadSol         1.2
	Luminosity     2.1
	Teff           6250
	FeH            0.04
	Age            2.5

	BinaryOrbit
	{
		Separation      623.832
	}
}

Star	"HD 107705 B"
{
	ParentBody     "HD 107705"
	Class          "K5V"
	MassSol        0.75

	BinaryOrbit
	{
		Separation      623.832
	}
}
