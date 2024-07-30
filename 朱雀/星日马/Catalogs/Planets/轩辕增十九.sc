// 55 Cnc System
// Reference: https://en.wikipedia.org/wiki/55_Cancri

Remove "55 Cnc A"{ParentBody "55 Cnc"}
Remove "55 Cnc B"{ParentBody "55 Cnc"}
Remove "55 Cnc b"{ParentBody "Copernicus"}
Remove "55 Cnc c"{ParentBody "Copernicus"}
Remove "55 Cnc d"{ParentBody "Copernicus"}
Remove "55 Cnc e"{ParentBody "Copernicus"}
Remove "55 Cnc f"{ParentBody "Copernicus"}

// ------------------------------Stars------------------------------ //

// Object * rho01 Cnc  ---  High Proper Motion Star  ---  OID=@1124653   (@@144553,2)  ---  coobox=5500 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source 
Star "Copernicus/RHO1 Cnc A/55 Cnc A/HD 75732A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "RHO1 Cnc"
	Class           "K0IV-V"
	AbsMagn         5.50
	MassSol         0.905
	RadSol          0.943
	LumBol          0.582
	Teff            5172
	FeH             0.35
	RotationPeriod  931.2
	Age             8.6
	// 生成
	Obliquity       33.4344
	EqAscendNode    -4.97146

	BinaryOrbit     
	{
		// 已知
		Separation      1065
		// 生成
		Eccentricity    0.176835289
		Inclination     0.922543406
		AscendingNode   118.167939
		ArgOfPericenter 78.7891093
		MeanAnomaly     92.5907354
	}
}


// -----------------------------Planets----------------------------- //

// Object * rho01 Cnc B  ---  High Proper Motion Star  ---  OID=@1124340   (@@22216,17)  ---  coobox=5500 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Star,X-ray Source 
Star "RHO1 Cnc B/GJ 324 B/HD 75732B/BD+28 1660B/AP J08524084+2818589/Gaia DR3 704966762213039488/TIC 332064684/WDS J08526+2820B/LSPM J0852+2818/USNO-B1.0 1183-00181876/55 Cnc B/RHO Cnc B/2E 2061/CSI+28 1660 2/G 47-9/G 51-28/GEN# +1.00075732B/LFT 610/LHS 2063/LTT 12311/NLTT 20418/PM 08497+2830/UBV 8592/USNO 712/[RHG95] 1383/2MASS J08524084+2818589/2E 0849.6+2830/PM 08496+2831B/** LDS 6219B/WISEA J085240.47+281856.2/UCAC4 592-044672/PM J08526+2818/Gaia DR2 704966762213039488/Karmn J08526+283"
{
	DateUpdated     "2024-07-29"
	ParentBody      "RHO1 Cnc"
	Class           "M4.5V"
	AbsMagn         12.58
	MassSol         0.264
	RadSol          0.268
	LumBol          0.00788
	Teff            3320
	FeH             0.15
	RotationPeriod  146.64
	// 生成
	Obliquity       47.6646
	EqAscendNode    12.3378
}

// Object * rho01 Cnc b  ---  Extra-solar Planet  ---  OID=@1124436   (@@22226,5)  ---  coobox=5500
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"Galileo/RHO1 Cnc Ab/55 Cnc Ab/HD 75732b"
{
	ParentBody     "55 Cnc A"
	DiscMethod     "RadVel"
	DiscDate       "1996"
	Class	       "GasGiant"
	MassJup         0.824
	Oblateness      0
	Color          (0.709 0.629 0.682)

	Surface
	{
		Preset          "55_cnc_b.cfg"
		SurfStyle       0.2162
		Randomize      (0.128, 0.554, -0.671)
		detailScale     188127
		colorConversion true
		tropicLatitude  0.0530525
		icecapLatitude  0.953052
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0.0628107
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.68512
		stripeFluct     0.400584
		stripeTwist     11.5784
		cycloneMagn     15.1325
		cycloneFreq     0.999124
		cycloneDensity  0.121321
		cycloneOctaves  5
		BumpHeight      14.1079
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          64.1797
		Velocity        1085.18
		BumpHeight      50.0753
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.10271
		mainOctaves     12
		Coverage        0.521154
		stripeZones     4.68512
		stripeFluct     0.400584
		stripeTwist     11.5784
	}

	Clouds
	{
		Height          114.258
		Velocity        1768.84
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.10271
		mainOctaves     12
		Coverage        0.521154
		stripeZones     4.68512
		stripeFluct     0.400584
		stripeTwist     11.5784
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          514.861
		Density         5382.52
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2    	92.5296
			He    	7.15434
			CH4   	0.247347
			N2    	0.0319972
			NH3   	0.0236163
			O2    	0.00654008
			C2H2  	0.00273103
			C2H4  	0.00115668
			Ne    	0.000986615
			Ar    	0.000828676
			C2H6  	0.000568947
			C3H8  	0.000300846
		}
	}

	Aurora
	{
		Height      5166.59
		NorthLat    86.2019
		NorthLon    52.0908
		NorthRadius 24776.1
		NorthWidth  15779
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -87.452
		SouthLon    231.138
		SouthRadius 15450
		SouthWidth  8587.43
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
		Epoch           2450002.94749
		SemiMajorAxis   0.11339
		PeriodDays      14.65314
		Eccentricity    0.0023
		Inclination     89.73
		AscendingNode   3.04112 // 生成
		ArgOfPericenter 131.94
		MeanAnomaly     0
	}
}

// Object * rho01 Cnc c  ---  Extra-solar Planet  ---  OID=@1124643   (@@133303,4)  ---  coobox=5500
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"Brahe/RHO1 Cnc Ac/55 Cnc Ac/HD 75732c"
{
	ParentBody     "55 Cnc A"
	DiscMethod     "RadVel"
	DiscDate       "2004"
	Class	       "IceGiant"
	Mass            51.2
	Oblateness      0

	Surface
	{
		Preset          "55_cnc_c.cfg"
		SurfStyle       0.154123
		Randomize      (-0.322, -0.443, -0.256)
		detailScale     76486.8
		colorConversion true
		tropicLatitude  0.0532093
		icecapLatitude  0.953209
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.87818
		stripeFluct     0.359554
		stripeTwist     8.57768
		cycloneMagn     13.5176
		cycloneFreq     0.661386
		cycloneDensity  0.292879
		cycloneOctaves  0
		BumpHeight      12.6266
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          69.5762
		Velocity        404.238
		BumpHeight      56.9499
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.10428
		mainOctaves     12
		Coverage        0.513647
		stripeZones     4.87818
		stripeFluct     0.359554
		stripeTwist     8.57768
	}

	NoOcean         true
	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          297.376
		Density         5382.45
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2    	92.6698
			He    	6.9977
			CH4   	0.255575
			N2    	0.0365237
			NH3   	0.0256793
			O2    	0.00767803
			C2H2  	0.00331874
			C2H4  	0.00112145
			Ne    	0.000896071
			Ar    	0.000813368
			C2H6  	0.000559025
			C3H8  	0.000290244
		}
	}

	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		Epoch           2450002.94749
		SemiMajorAxis   0.23735
		PeriodDays      44.3989
		Eccentricity    0.072
		Inclination     85
		AscendingNode   3.05012 // 生成
		ArgOfPericenter 131.94
		MeanAnomaly     0
	}
}

// Object * rho01 Cnc d  ---  Extra-solar Planet  ---  OID=@1124543   (@@124027,1)  ---  coobox=5500
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"Lippershey/RHO1 Cnc Ad/55 Cnc Ad/HD 75732d"
{
	ParentBody     "55 Cnc A"
	DiscMethod     "RadVel"
	DiscDate       "2002"
	Class	       "GasGiant"
	MassJup         3.84 // TESS
	Oblateness      0

	Surface
	{
		Preset         "55_cnc_d.cfg"
		SurfStyle       0.827522
		Randomize      (0.109, -0.988, 0.453)
		detailScale     198643
		colorConversion true
		tropicLatitude  0.98801
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     7.39547
		stripeFluct     0.448601
		stripeTwist     11.3752
		cycloneMagn     9.99842
		cycloneFreq     0.501746
		cycloneDensity  0.369078
		cycloneOctaves  5
		BumpHeight      6.89406
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          17.4844
		Velocity        11.8185
		BumpHeight      10.5885
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.01676
		mainOctaves     12
		Coverage        0.0920801
		stripeZones     7.39547
		stripeFluct     0.448601
		stripeTwist     11.3752
	}

	Clouds
	{
		Height          28.0703
		Velocity        2089.18
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.416)
		mainFreq        1.01676
		mainOctaves     12
		Coverage        0.0920801
		stripeZones     7.39547
		stripeFluct     0.448601
		stripeTwist     11.3752
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          112.779
		Density         5867.77
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2    	92.4014
			He    	7.43243
			CH4   	0.115254
			N2    	0.041656
			O2    	0.00731985
			Ne    	0.00115693
			Ar    	0.000787174
		}
	}

	Aurora
	{
		Height      6020.44
		NorthLat    87.2129
		NorthLon    134.532
		NorthRadius 17136.7
		NorthWidth  11236.6
		NorthRings  5
		NorthBright 1
		NorthParticles 10000
		SouthLat    -86.3713
		SouthLon    314.051
		SouthRadius 21209.6
		SouthWidth  12254.5
		SouthRings  4
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     86951
		OuterRadius     197578
		EdgeRadius      240000
		MeanRadius      90484
		Thickness       0.452
		RocksMaxSize    0.0181
		RocksSpacing    1
		DustDrawDist    1.36e+03
		ChartRadius     9.76e+04
		RotationPeriod  2.22
		Brightness      1
		FrontBright     2.87
		BackBright      4.27
		Density         0.5
		Opacity         0.5
		SelfShadow      0.987
		PlanetShadow    0.987
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.06
		densityScale    1.6
		densityOffset   -0.17
		densityPower    4.97
		colorContrast   0.0908
		FrontColor      (0.431 0.819 1.000)
		BackThickColor  (0.756 0.927 1.000)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		Epoch           2453490
		SemiMajorAxis   5.957
		PeriodDays      5574.2
		Eccentricity    0.0269
		Inclination     53 // HST
		AscendingNode   175.605632 // 生成
		ArgOfPericenter 254.0
		MeanAnomaly     0
	}
}

// Object * rho01 Cnc e  ---  Extra-solar Planet  ---  OID=@1124640   (@@133303,0)  ---  coobox=5500
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"Janssen/TOI-1773e/TOI-1773.01/RHO1 Cnc Ae/55 Cnc Ae/HD 75732e"
{
	ParentBody     "55 Cnc A"
	DiscMethod     "RadVel"
	DiscDate       "2004"
	Class	       "Carbonia"
	Mass            7.99
	Radius          11959.006875
	Oblateness      0
	Obliquity       23
	Color          (0.612 0.499 0.209)

	Surface
	{
		Preset         "55_cnc_e_diamond.cfg"
		SurfStyle       0.328938
		OceanStyle      0.0530753
		Randomize      (-0.559, -0.981, -0.170)
		colorDistMagn   0.0454887
		colorDistFreq   1471.25
		detailScale     31259.8
		colorConversion true
		seaLevel        0.131662
		snowLevel       0.85
		tropicLatitude  0.248382
		icecapLatitude  10
		icecapHeight    0.26838
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.766065
		venusFreq       1.44496
		venusMagn       0
		mareFreq        2.16557
		mareDensity     0.202983
		terraceProb     0.269986
		erosion         0
		montesMagn      0.251097
		montesFreq      665.461
		montesSpiky     0.98305
		montesFraction  0.733739
		dunesMagn       0.0357016
		dunesFreq       87.3777
		dunesFraction   0.809385
		hillsMagn       0.126858
		hillsFreq       1323.71
		hillsFraction   0
		hills2Fraction  0
		riversMagn      65.5466
		riversFreq      3.43095
		riversSin       6.73534
		riversOctaves   0
		canyonsMagn     0.0577763
		canyonsFreq     328.554
		canyonFraction  0
		cracksMagn      0.0964778
		cracksFreq      1.42671
		cracksOctaves   0
		craterMagn      0.771322
		craterFreq      24.4156
		craterDensity   0
		craterOctaves   0.30627
		volcanoMagn     0.621805
		volcanoFreq     0.609864
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.856018
		volcanoRadius   0.506267
		volcanoTemp     1273.02
		lavaCoverTidal  1.07807
		lavaCoverSun    0.683903
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.16715
		cycloneDensity  0.357075
		cycloneOctaves  0
		BumpHeight      13.1554
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.407391
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          12.1064
		Velocity        26.1428
		BumpHeight      5.03754
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.08936
		mainOctaves     10
		Coverage        0.162366
		stripeZones     1
		stripeTwist     3.5
	}

	NoOcean         true

	Atmosphere
	{
		Model          "Titan"
		Height          111.583
		Density         0.0592609
		Pressure        0.220652
		Greenhouse      42.3347
		Bright          9.00645
		Opacity         1
		SkyLight        3.00215
		Hue             0
		Saturation      1

		Composition // 成分占比未知
		{
			C2H2  	11.111
			Ca      11.111
			Fe      11.111
			H2O     11.111
			HCN     11.111
			K       11.111
			Mg      11.111
			N2      11.111
			NH3     11.111
		}
	}

	Aurora
	{
		Height      327.005
		NorthLat    75.7053
		NorthLon    144.698
		NorthRadius 3731.38
		NorthWidth  1148.7
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -65.6715
		SouthLon    317.808
		SouthRadius 4950.03
		SouthWidth  1238.81
		SouthRings  2
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true
	NoAccretionDisk true

	CometTail
	{
		MaxLength   1.70242
		GasToDust   0
		Particles   3442
		GasBright   0.0605601
		DustBright  0.12226
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		Epoch           2449999.83643
		SemiMajorAxis   0.015439
		PeriodDays      0.73654625
		Eccentricity    0.05
		Inclination     83.59
		AscendingNode   3.30007 // 生成
		ArgOfPericenter 86.0
		MeanAnomaly     0
	}
}

// Object * rho01 Cnc f  ---  Extra-solar Planet  ---  OID=@3989881   (@@-1,255)  ---  coobox=5500
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"Harriot/RHO1 Cnc Af/55 Cnc Af/HD 75732f"
{
	ParentBody     "55 Cnc A"
	DiscMethod     "RadVel"
	DiscDate       "2007"
	Class	       "IceGiant"
	Mass            47.8
	Oblateness      0

	Surface
	{
		Preset         "55_cnc_f.cfg"
		SurfStyle       0.475098
		Randomize      (-0.201, 0.460, -0.118)
		detailScale     71497.6
		colorConversion true
		tropicLatitude  0.840528
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     4.67163
		stripeFluct     0.467228
		stripeTwist     12.2215
		cycloneMagn     11.777
		cycloneFreq     0.597092
		cycloneDensity  0.504695
		cycloneOctaves  0
		BumpHeight      13.0133
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          119
		Velocity        -338.445
		BumpHeight      56.9851
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.738449
		mainOctaves     12
		Coverage        0.529266
		stripeZones     4.67163
		stripeFluct     0.467228
		stripeTwist     12.2215
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          277.978
		Density         5360.62
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2    	93.2893
			He    	6.34859
			CH4   	0.290381
			N2    	0.0364077
			NH3   	0.0216788
			O2    	0.00692794
			C2H2  	0.00285911
			C2H4  	0.00134878
			Ne    	0.000957848
			Ar    	0.000674078
			C2H6  	0.000601327
			C3H8  	0.000273629
		}
	}

	Aurora
	{
		Height      559.274
		NorthLat    81.0294
		NorthLon    84.5808
		NorthRadius 5327.94
		NorthWidth  1383.14
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -68.2212
		SouthLon    262.354
		SouthRadius 6245.86
		SouthWidth  1811.14
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     40027
		OuterRadius     86916.3
		EdgeRadius      98000
		MeanRadius      43275
		Thickness       0.216
		RocksMaxSize    0.00865
		RocksSpacing    1
		DustDrawDist    649
		ChartRadius     4.98e+04
		RotationPeriod  3.8
		Brightness      1
		FrontBright     2.77
		BackBright      4.84
		Density         0.1
		Opacity         0.1
		SelfShadow      0.971
		PlanetShadow    0.971
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       6.99
		densityScale    1.47
		densityOffset   -0.484
		densityPower    0.995
		colorContrast   0.0776
		FrontColor      (0.644 0.381 1.000)
		BackThickColor  (0.555 0.400 0.800)
		BackIceColor    (0.637 0.300 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		Epoch           2451878
		SemiMajorAxis   0.7708
		PeriodDays      259.88
		Eccentricity    0.08
		Inclination     53 // HST
		AscendingNode   -82.9231528 // 生成
		ArgOfPericenter 139
		MeanAnomaly     0
	}
}