// ExoPlanets for 82 G. Eridani
// Semi-hypothetical planetary system

Remove "HD 20794 b"{ParentBody "HD 20794"}
Remove "HD 20794 c"{ParentBody "HD 20794"}
Remove "HD 20794 d"{ParentBody "HD 20794"}
Remove "HD 20794 e"{ParentBody "HD 20794"}

// Reference:
// Real objects: https://en.wikipedia.org/wiki/82_G._Eridani
// Hypothetical objects: https://tieba.baidu.com/p/6650689793

// Object * e Eri  ---  High Proper Motion Star  ---  OID=@3000889   (@@74570,0)  ---  coobox=23184 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "e Eri A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "82 Eri"
	Class           "G6V"
	AbsMagn         5.34
	MassSol         0.70
	RadSol          0.92
	LumBol          0.74
	Teff            5401
	FeH             -0.40
	RotationPeriod  796.56
	Age             12.7 // 6.1
}

Planet	"HD 20794g"
{
	DiscMethod     "RadVel"
	DiscDate       "2017"
	ParentBody     "e Eri A"
	Class	       "Terra"
	Mass            1.03
	Oblateness      0
	Color          (0.778 0.776 0.772)

	Surface
	{
		Preset          "82_eri_g.cfg"
		SurfStyle       0.989042
		OceanStyle      0.536962
		Randomize      (0.575, 0.499, 0.798)
		colorDistMagn   0.0507939
		colorDistFreq   120.145
		detailScale     2992.49
		colorConversion true
		drivenDarkening 0
		seaLevel        0.21466
		snowLevel       2
		tropicLatitude  0.0482974
		icecapLatitude  10
		icecapHeight    0.0787774
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.85799
		venusFreq       0.768715
		venusMagn       0
		mareFreq        0.443173
		mareDensity     0.00187794
		terraceProb     0.428947
		erosion         0
		montesMagn      0.063482
		montesFreq      44.0106
		montesSpiky     0.783448
		montesFraction  0.223075
		dunesMagn       0.0349525
		dunesFreq       1565.95
		dunesFraction   0.651448
		hillsMagn       0.147319
		hillsFreq       131.859
		hillsFraction   0.435337
		hills2Fraction  0
		riversMagn      63.034
		riversFreq      3.31889
		riversSin       4.88265
		riversOctaves   0
		canyonsMagn     0.599811
		canyonsFreq     0.442667
		canyonFraction  0.243612
		cracksMagn      0.0235852
		cracksFreq      0.372838
		cracksOctaves   0
		craterMagn      0.632196
		craterFreq      2.60342
		craterDensity   0.924139
		craterOctaves   10
		craterRayedFactor 0
		volcanoMagn     0.192253
		volcanoFreq     0.665211
		volcanoDensity  0.185035
		volcanoOctaves  3
		volcanoActivity 0.0872892
		volcanoFlows    0.169149
		volcanoRadius   0.1678
		volcanoTemp     1682.54
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoClouds        true
	NoOcean         true
	NoLava          true
	NoAtmosphere    true
	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.095
		PeriodDays      11.86
		Eccentricity    0.20
		// 生成
		Inclination     -0.762763
		AscendingNode   56.8406
		ArgOfPericenter 288.066
		MeanAnomaly     82.7638
	}
}

// Object * e Eri b  ---  Extra-solar Planet  ---  OID=@6179242   (@@-1,255)  ---  coobox=23184
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"e Eri b/GJ 139 b/HD 20794b"
{
	DiscMethod     "RadVel"
	DiscDate       "2011"
	ParentBody     "e Eri A"
	Class	       "Terra"
	Mass            2.0 // 2.82
	Oblateness      0
	Color          (0.610 0.606 0.604)

	Surface
	{
		Preset          "82_eri_b.cfg"
		SurfStyle       0.12357
		OceanStyle      0.268238
		Randomize      (-0.747, -0.016, 0.889)
		colorDistMagn   0.0668191
		colorDistFreq   192.531
		detailScale     4151.92
		colorConversion true
		drivenDarkening 0
		seaLevel        0.0907387
		snowLevel       2
		tropicLatitude  0.00966736
		icecapLatitude  10
		icecapHeight    0.12497
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        2.04839
		venusFreq       1.31922
		venusMagn       0
		mareFreq        0.626065
		mareDensity     0.0142408
		terraceProb     0.292365
		erosion         0
		montesMagn      0.0737261
		montesFreq      95.9405
		montesSpiky     0.989271
		montesFraction  0.387462
		dunesMagn       0.0217651
		dunesFreq       2086.64
		dunesFraction   0.678121
		hillsMagn       0.117528
		hillsFreq       181.118
		hillsFraction   0.307296
		hills2Fraction  0
		riversMagn      52.3852
		riversFreq      4.76124
		riversSin       6.52952
		riversOctaves   0
		canyonsMagn     0.559845
		canyonsFreq     0.552897
		canyonFraction  0.197205
		cracksMagn      0.0504079
		cracksFreq      1.05067
		cracksOctaves   0
		craterMagn      0.59411
		craterFreq      2.91516
		craterDensity   0.849229
		craterOctaves   11
		craterRayedFactor 0.153628
		volcanoMagn     0.21298
		volcanoFreq     0.732984
		volcanoDensity  0.204639
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.327665
		volcanoRadius   0.210703
		volcanoTemp     1400.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          10
		Velocity        80
		BumpHeight      6.66
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.816
		mainOctaves     10
		Coverage        0.346
		stripeZones     1
		stripeTwist     3.5
	}

	NoOcean         true
	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          200
		Greenhouse      55
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1
	}

	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.13
		PeriodDays      18.32
		Eccentricity    0.09
		// 生成
		Inclination     1.44136
		AscendingNode   -120.385
		ArgOfPericenter 117.616
		MeanAnomaly     282.573
	}
}

// Object * e Eri c  ---  Extra-solar Planet  ---  OID=@6179243   (@@-1,255)  ---  coobox=23184
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"e Eri c/GJ 139 c/HD 20794c"
{
	DiscMethod     "RadVel"
	DiscDate       "2011"
	ParentBody     "e Eri A"
	Class	       "Terra"
	Mass            2.52
	Oblateness      0
	Color          (0.662 0.658 0.651)

	Surface
	{
		Preset          "82_eri_c.cfg"
		SurfStyle       0.173781
		OceanStyle      0.389407
		Randomize      (0.802, -0.746, -0.370)
		colorDistMagn   0.0575085
		colorDistFreq   481.625
		detailScale     10848.9
		colorConversion true
		drivenDarkening 0
		seaLevel        0.315421
		snowLevel       2
		tropicLatitude  0.515974
		icecapLatitude  0.95564
		icecapHeight    0.317003
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.99501
		venusFreq       0.401009
		venusMagn       0
		mareFreq        1.33681
		mareDensity     0.0111599
		terraceProb     0.836864
		erosion         0
		montesMagn      0.206086
		montesFreq      203.365
		montesSpiky     0.824521
		montesFraction  0.436791
		dunesMagn       0.0341231
		dunesFreq       5467.65
		dunesFraction   0.666368
		hillsMagn       0.116268
		hillsFreq       510.355
		hillsFraction   0.79049
		hills2Fraction  0.159973
		riversMagn      64.2076
		riversFreq      1.65813
		riversSin       6.473
		riversOctaves   0
		canyonsMagn     0.591476
		canyonsFreq     1.33057
		canyonFraction  0
		cracksMagn      0.0588836
		cracksFreq      2.68486
		cracksOctaves   5
		craterMagn      0.638142
		craterFreq      11.8813
		craterDensity   0.822545
		craterOctaves   12
		craterRayedFactor 0.110174
		volcanoMagn     0.522689
		volcanoFreq     0.688287
		volcanoDensity  0.223067
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.142166
		volcanoRadius   0.49848
		volcanoTemp     1431.11
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.9991
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	Clouds
	{
		Height          10
		Velocity        115
		BumpHeight      8.28
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.766
		mainOctaves     10
		Coverage        0.256
		stripeZones     1.91
		stripeTwist     0.369
	}

	NoOcean         true
	NoLava          true

	Atmosphere
	{
		Model          "Ethereal"
		Height          100
		Greenhouse      0.0113934
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.020698
		Saturation      1
	}

	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.225
		PeriodDays      43.17
		Eccentricity    0.17
		// 生成
		Inclination     1.2025
		AscendingNode   132.65
		ArgOfPericenter 352.697
		MeanAnomaly     203.509
	}
}

// Object * e Eri d  ---  Extra-solar Planet  ---  OID=@6179244   (@@-1,255)  ---  coobox=23184
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"e Eri d/GJ 139 d/HD 20794d"
{
	DiscMethod     "RadVel"
	DiscDate       "2011"
	ParentBody     "e Eri A"
	Class	       "Terra"
	Mass            4.7
	Oblateness      0
	Color          (0.627 0.624 0.619)

	Surface
	{
		SurfStyle       0.0309877
		OceanStyle      0.0885371
		Randomize      (-0.411, 0.927, 0.022)
		colorDistMagn   0.0557365
		colorDistFreq   297.413
		detailScale     6430.6
		colorConversion true
		drivenDarkening 0
		seaLevel        0.225678
		snowLevel       2
		tropicLatitude  0.32997
		icecapLatitude  0.826761
		icecapHeight    0.235815
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.92488
		venusFreq       1.15253
		venusMagn       0
		mareFreq        1.35496
		mareDensity     0.00331988
		terraceProb     0.37068
		erosion         0
		montesMagn      0.190957
		montesFreq      155.577
		montesSpiky     0.912187
		montesFraction  0.0589059
		dunesMagn       0.0447538
		dunesFreq       3303.87
		dunesFraction   0.557934
		hillsMagn       0.126642
		hillsFreq       273.782
		hillsFraction   0.37186
		hills2Fraction  0.140808
		riversMagn      58.8434
		riversFreq      3.54409
		riversSin       6.82864
		riversOctaves   0
		canyonsMagn     0.609362
		canyonsFreq     0.622521
		canyonFraction  0
		cracksMagn      0.0708777
		cracksFreq      0.751379
		cracksOctaves   1
		craterMagn      0.539035
		craterFreq      6.16206
		craterDensity   0.944019
		craterOctaves   12
		craterRayedFactor 0.189405
		volcanoMagn     0.50096
		volcanoFreq     0.735681
		volcanoDensity  0.200658
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.394313
		volcanoRadius   0.33286
		volcanoTemp     1600.55
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.999999
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true
	NoOcean         true
	NoLava          true

	Atmosphere
	{
		Model          "Ethereal"
		Height          125.97
		Greenhouse      0.000215702
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             -0.0324
		Saturation      1
	}

	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.37
		PeriodDays      89.58
		Eccentricity    0.13
		// 生成
		Inclination     -2.13139
		AscendingNode   49.0269
		ArgOfPericenter 138.804
		MeanAnomaly     193.76
	}
}

Planet	"HD 20794e"
{
	DiscMethod     "RadVel"
	DiscDate       "2017"
	ParentBody     "e Eri A"
	Class	       "Terra"
	Mass            4.77
	Oblateness      0
	Color          (0.516 0.396 0.332)

	Surface
	{
		Preset          "82_eri_e.cfg"
		SurfStyle       0.328318
		OceanStyle      0.52532
		Randomize      (-0.006, 0.132, -0.954)
		colorDistMagn   0.0488415
		colorDistFreq   1497.95
		detailScale     28199.3
		colorConversion true
		drivenDarkening 0
		seaLevel        0.199732
		snowLevel       2
		tropicLatitude  0.467198
		icecapLatitude  1
		icecapHeight    0.199732
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.75604
		venusFreq       1.42651
		venusMagn       0
		mareFreq        1.92659
		mareDensity     0.139071
		terraceProb     0.207746
		erosion         0
		montesMagn      0.214462
		montesFreq      428.137
		montesSpiky     0.882221
		montesFraction  0.221636
		dunesMagn       0.0546748
		dunesFreq       14811.7
		dunesFraction   0.234464
		hillsMagn       0.113992
		hillsFreq       1299.4
		hillsFraction   0.893797
		hills2Fraction  0.0461194
		riversMagn      61.5574
		riversFreq      2.34463
		riversSin       7.30197
		riversOctaves   0
		canyonsMagn     0.312673
		canyonsFreq     3.38219
		canyonFraction  0
		cracksMagn      0.0368884
		cracksFreq      6.68822
		cracksOctaves   8
		craterMagn      0.569502
		craterFreq      33.3371
		craterDensity   0.971228
		craterOctaves   14
		craterRayedFactor 0.184935
		volcanoMagn     0.644304
		volcanoFreq     0.819507
		volcanoDensity  0.204231
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.304729
		volcanoRadius   0.519219
		volcanoTemp     1439.48
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.99976
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	Clouds
	{
		Height          12
		Velocity        300
		BumpHeight      9.09
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.891
		mainOctaves     10
		Coverage        0.25
		stripeZones     1.46
		stripeTwist     0.127
	}

	NoOcean         true
	NoLava          true

	Atmosphere
	{
		Model          "Ethereal"
		Height          80
		Greenhouse      0.100606
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0.00270595
		Saturation      1
	}

	Aurora
	{
		Height         222
		NorthLat       71.2
		NorthLon       127
		NorthRadius    2.76e+03
		NorthWidth     779
		NorthRings     3
		NorthBright    0.3
		NorthFlashFreq 71.7
		NorthMoveSpeed 0.942
		NorthParticles 50000
		SouthLat       -76.2
		SouthLon       180
		SouthRadius    2.5e+03
		SouthWidth     839
		SouthRings     2
		SouthBright    0.3
		SouthFlashFreq 65.8
		SouthMoveSpeed 1.07
		SouthParticles 50000
		TopColor    (0.247 0.580 0.894)
		BottomColor (0.035 0.255 0.620)
	}

	Rings
	{
		InnerRadius     15320
		OuterRadius     24583
		EdgeRadius      24583
		MeanRadius      1.76e+04
		Thickness       0.0878
		RocksMaxSize    0.00351
		RocksSpacing    1
		DustDrawDist    264
		ChartRadius     2.21e+04
		RotationPeriod  3.24
		Brightness      1
		FrontBright     2.83
		BackBright      4.07
		Density         0.953
		Opacity         0.953
		SelfShadow      0.953
		PlanetShadow    0.953
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.52
		densityScale    1.45
		densityOffset   -0.37
		densityPower    1.03
		colorContrast   0.089
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	Orbit
	{
		// 已知
		SemiMajorAxis   0.509
		PeriodDays      147.02
		Eccentricity    0.29
		// 生成
		Inclination     -1.04069
		AscendingNode   75.8602
		ArgOfPericenter 103.584
		MeanAnomaly     291.902
	}
}

Planet	"HD 20794f"
{
	DiscMethod     "RadVel"
	DiscDate       "2017"
	ParentBody     "e Eri A"
	Class	       "IceGiant"
	Mass            10.26
	Oblateness      0

	Surface
	{
		Preset          "82_Eri_f.cfg"
		SurfStyle       0.814335
		Randomize      (-0.671, 0.499, 0.875)
		detailScale     181433
		colorConversion true
		tropicLatitude  0.0314969
		icecapLatitude  0.931497
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.61853
		stripeFluct     0.41503
		stripeTwist     9.12676
		cycloneMagn     10.7722
		cycloneFreq     1.10468
		cycloneDensity  0.334334
		cycloneOctaves  5
		BumpHeight      13.4345
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          37.8594
		Velocity        -1155.27
		BumpHeight      24.4251
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.845581
		mainOctaves     12
		Coverage        0.149632
		stripeZones     2.61853
		stripeFluct     0.41503
		stripeTwist     9.12676
	}

	Clouds
	{
		Height          62.2813
		Velocity        1030.1
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        0.845581
		mainOctaves     12
		Coverage        0.149632
		stripeZones     2.61853
		stripeFluct     0.41503
		stripeTwist     9.12676
	}

	NoOcean         true
	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          400
		Bright          10
		Opacity         0.5
		SkyLight        3.33333
		Hue             -0.0270731
		Saturation      0.70502
	}

	Aurora
	{
		Height      1600.65
		NorthLat    84.5658
		NorthLon    94.731
		NorthRadius 13811.8
		NorthWidth  4349.63
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -85.8964
		SouthLon    274.118
		SouthRadius 23804.5
		SouthWidth  11034.3
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.875
		PeriodDays      331.41
		Eccentricity    0.05
		// 生成
		Inclination     1.54133
		AscendingNode   -85.3271
		ArgOfPericenter 8.9071
		MeanAnomaly     356.347
	}
}

Planet	"HD 20794h"
{
	DiscMethod     "RadVel"
	DiscDate       "2023"
	ParentBody     "e Eri A"
	Class          "Aquaria"
	Mass            6.6
	Oblateness      0
	Color          (0.568 0.562 0.559)

	Surface
	{
		Preset          "82_eri_h.cfg"
		SurfStyle       0.81899
		OceanStyle      0.21429
		Randomize      (0.587, -0.602, 0.406)
		colorDistMagn   0.0996616
		colorDistFreq   790.06
		detailScale     14681.3
		colorConversion true
		seaLevel        0.890342
		snowLevel       2
		tropicLatitude  0.0226971
		icecapLatitude  1
		icecapHeight    1.05248
		climatePole     0.9375
		climateTropic   0.514293
		climateEquator  0.6875
		heightTempGrad  0.423207
		tropicWidth     0.350156
		mainFreq        0.967032
		venusFreq       0.378992
		venusMagn       0.268575
		mareFreq        0
		mareDensity     0
		terraceProb     0.235971
		erosion         0
		montesMagn      0.165159
		montesFreq      238.29
		montesSpiky     0.969096
		montesFraction  0.67924
		dunesMagn       0.054561
		dunesFreq       59.0095
		dunesFraction   0.290028
		hillsMagn       0.105011
		hillsFreq       536.931
		hillsFraction   0.459422
		hills2Fraction  0.492936
		riversMagn      56.8757
		riversFreq      2.00205
		riversSin       7.08988
		riversOctaves   0
		canyonsMagn     0.0564445
		canyonsFreq     179.421
		canyonFraction  0.725236
		cracksMagn      0.102067
		cracksFreq      0.490592
		cracksOctaves   1
		craterMagn      0.0518387
		craterFreq      49.7426
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.650775
		volcanoFreq     0.672562
		volcanoDensity  0
		volcanoOctaves  0
		volcanoActivity 0.13648
		volcanoFlows    0
		volcanoRadius   0.446741
		volcanoTemp     1696.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.30762
		stripeTwist     0.389484
		cycloneMagn     2.41704
		cycloneFreq     0.769549
		cycloneDensity  0.274207
		cycloneOctaves  3
		BumpHeight      36.7317
		BumpOffset      32.7038
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          4.81641
		Velocity        77.1712
		BumpHeight      4.81635
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.993544
		mainOctaves     10
		Coverage        0.242714
		stripeZones     2.30762
		stripeTwist     0.389484
	}

	Ocean
	{
		Height          32.7038
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          92.3049
		Greenhouse      5.78699
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.020792
		Saturation      0.965466
	}

	Aurora
	{
		Height      83.6439
		NorthLat    54.428
		NorthLon    77.7655
		NorthRadius 952.662
		NorthWidth  243.615
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -31.3757
		SouthLon    255.593
		SouthRadius 1596.91
		SouthWidth  494.324
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     1.49e+04
		OuterRadius     9.54e+04
		EdgeRadius      3.27e+04
		MeanRadius      2.08e+04
		Thickness       0.104
		RocksMaxSize    0.00416
		RocksSpacing    1
		DustDrawDist    312
		ChartRadius     3.27e+04
		RotationPeriod  3.95
		Brightness      1
		FrontBright     2.47
		BackBright      2.27
		Density         0.222
		Opacity         0.222
		SelfShadow      0.111
		PlanetShadow    0.111
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       60
		densityScale    1.54
		densityOffset   -0.305
		densityPower    1.02
		colorContrast   0.0787
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   1.36
		PeriodDays      644.6
		Eccentricity    0.40
		// 生成
		Inclination     1.12955
		AscendingNode   114.382
		ArgOfPericenter 215.075
		MeanAnomaly     164.312
	}
}