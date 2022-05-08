// 女宿增四(***)
Barycenter "12 Aqr A/HD 200497/HR 8059/SAO 145065"
{
	ParentBody "12 Aqr"
	BinaryOrbit
	{
		Separation      366
	}
}

Star "12 Aqr Aa"
{
	ParentBody "12 Aqr A"
	Class      "K0III"
	MassSol    2.6
	Teff       5012

	Orbit
	{
		Period          18.5
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "12 Aqr Ab"
{
	ParentBody "12 Aqr A"
	Class      "A3V"
  MassSol    2
  Teff       8511

	Orbit
	{
		Period          18.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "12 Aqr B/HD 200496/HR 8058/SAO 145064"
{
	ParentBody "12 Aqr"
	Class      "A4"
  MassSol    1.9
  Teff       8318

	/*BinaryOrbit
	{
		Separation      366
	}*/
}

// 女宿增五(**)
Star "HD 199345 A"
{
	ParentBody "HD 199345"
	Class      "K0III"
	RadSol     46
  Luminosity 403.66
	Teff       3990
  FeH        -0.17

	BinaryOrbit
	{
    Epoch           2452275.01779566
		Separation      424.2
    PositionAngle   165
	}
}

Star "HD 199345 B"
{
	ParentBody "HD 199345"
	Class      "B7.7 V"

  /*BinaryOrbit
	{
    Epoch           2452275.01779566
		Separation      424.2
    PositionAngle   165
	}*/
}

// 败瓜增一(***)
Star "HD 195325 B"
{
	ParentBody "HD 195325"
	Class      "G4.5 V"

  Orbit
	{
		SemiMajorAxis   207
	}
}

Star "HD 195325 C"
{
	ParentBody "HD 195325"
	Class      "A1.4 V"

  Orbit
	{
		SemiMajorAxis   3910
	}
}

// 败瓜增二(SB**)
Star	"HD 198391 A"
{
	ParentBody     "HD 198391"
	Class          "A1Vs"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0265800459
		Eccentricity    0.04484272
		Inclination     -2.231565
		AscendingNode   0
		ArgOfPericenter -151.19119
		MeanAnomaly     -46.4704803
	}
}

Star	"HD 198391 B"
{
	ParentBody     "HD 198391"
	Class          "A4.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0265800459
		Eccentricity    0.04484272
		Inclination     -2.231565
		AscendingNode   0
		ArgOfPericenter 28.8088099
		MeanAnomaly     -46.4704803
	}
}

// 败瓜增三(**)
Remove "13 Del A"{ParentBody "13 Del"}
Remove "13 Del B"{ParentBody "13 Del"}
Star "HD 198069 A"
{
	ParentBody "HD 198069"
	Class      "A0 V"
	MassSol    2.93
	Luminosity 119
	Teff       9840

	BinaryOrbit
	{
		Separation      197.298
	}
}

Star "HD 198069 B"
{
	ParentBody "HD 198069"
	Class      "F5.7 V"

	/*BinaryOrbit
	{
		Separation      197.298
	}*/
}

// 瓠瓜增五(**)
Star	"HD 196724 A"
{
	ParentBody     "HD 196724"
	Class          "A0V"
	MassSol        2.67
	Luminosity     71
	Teff           10507
	FeH            -0.15
	Age            0.254

	Orbit
	{
		RefPlane        "Equator"
		Period          0.920841935
		Eccentricity    0.637541234
		Inclination     0.00470590591
		AscendingNode   0
		ArgOfPericenter 9.72663419
		MeanAnomaly     137.805106
	}
}

Star	"HD 196724 B"
{
	ParentBody     "HD 196724"
	Class          "F4 IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.920841935
		Eccentricity    0.637541234
		Inclination     0.00470590591
		AscendingNode   0
		ArgOfPericenter 189.726634
		MeanAnomaly     137.805106
	}
}

// 天津增三(SB**)
Star	"HD 188892 A"
{
	ParentBody     "HD 188892"
	Class          "B5IV"
	MassSol        7.9
	RadSol         5.6
	Luminosity     7305
	Teff           15200
	Age            0.0373

	Orbit
	{
		PeriodDays      78.2
		Eccentricity    0.17
		Epoch           2443734.5
		ArgOfPericenter 319
		MeanAnomaly     0
		//SemiAmplitude   20.7
	}
}

Star	"HD 188892 B"
{
	ParentBody     "HD 188892"
	Class          "B3.2 V"

	Orbit
	{
		PeriodDays      78.2
		Eccentricity    0.17
		Epoch           2443734.5
		ArgOfPericenter 139
		MeanAnomaly     0
	}
}

// 天津增五(RS**)
Star	"HD 191026 A"
{
	ParentBody     "HD 191026"
	Class          "G8.5IVa"
	MassSol        1.26
	RadSol         2.51
	Luminosity     4.07
	Teff           5108
	FeH            -0.02
	Age            4.34

	Orbit
	{
		RefPlane        "Equator"
		Period          0.19378776
		Eccentricity    0.189723924
		Inclination     -1.43184614
		AscendingNode   0
		ArgOfPericenter -61.2129115
		MeanAnomaly     -153.018228
	}
}

Star	"HD 191026 B"
{
	ParentBody     "HD 191026"
	Class          "G4.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.19378776
		Eccentricity    0.189723924
		Inclination     -1.43184614
		AscendingNode   0
		ArgOfPericenter 118.787089
		MeanAnomaly     -153.018228
	}
}

// 天津增六(Be**)
Star	"HD 191610 A"
{
	ParentBody     "HD 191610"
	Class          "B2.5V"
	MassSol        9.5
	DimensionsSol  (13/11.4/13)
	Luminosity     1353.22
	Teff           11338
	Age            0.0221

	Orbit
	{
		RefPlane        "Equator"
		Period          5.04959546
		Eccentricity    0.471597463
		Inclination     1.87740654
		AscendingNode   0
		ArgOfPericenter 171.084776
		MeanAnomaly     129.648498
	}
}

Star	"HD 191610 B"
{
	ParentBody     "HD 191610"
	Class          "sdO"

	Orbit
	{
		RefPlane        "Equator"
		Period          5.04959546
		Eccentricity    0.471597463
		Inclination     1.87740654
		AscendingNode   0
		ArgOfPericenter 351.084776
		MeanAnomaly     129.648498
	}
}

// 天津增九(BSG**?)
Star	"HD 193237 A"
{
	ParentBody     "HD 193237"
	Class          "B1 0ep"
	MassSol        37
	RadSol         76
	Luminosity     610000
	Teff           18700
	HeH            0.29

	Corona
	{
		Radius      1e+10
		Period      0.025336
		Brightness  1
		RayDensity  6.5991
		RayCurv     152.64
	}

	Orbit
	{
		Period          7
		Eccentricity    0.75 // ?
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 193237 B"
{
	ParentBody     "HD 193237"
	Class          "B"
	MassSol        6 // 3

	Orbit
	{
		Period          7
		Eccentricity    0.75 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天津增十二(SB***)
Barycenter "HD 196093"
{
	ParentBody "HIP 101474"
	BinaryOrbit
	{
		Period          143.69
	}
}

Star "HD 196093 A"
{
	ParentBody "HD 196093"
	Class      "K6Ib"
	MassSol    12.1
	RadSol     575
	Teff       4217
	FeH        0.13
	Age        0.0176

	Orbit
	{
		PeriodDays      1117
		Eccentricity    0
		Epoch           2447088
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   2
	}
}

Star "HD 196093 B"
{
	ParentBody "HD 196093"
	Class      ""
  MassSol    0.57

	Orbit
	{
		PeriodDays      1117
		Eccentricity    0
		Epoch           2447088
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 196094"
{
	ParentBody "HIP 101474"
	Class      "B2.5"
  MassSol    10.96

	/*BinaryOrbit
	{
		Period          143.69
	}*/
}

// 天津增十四(SB**)
Star	"HD 193370 A"
{
	ParentBody     "HD 193370"
	Class          "F6Ib"
	MassSol        10
	RadSol         51
	Luminosity     7093
	Teff           6360
	FeH            0.02
	Age            0.022

	Orbit
	{
		PeriodDays      2440
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 193370 B"
{
	ParentBody     "HD 193370"
	Class          "B6.5"

	Orbit
	{
		PeriodDays      2440
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天津增十五(SB**)
Star	"HD 194317 A"
{
	ParentBody     "HD 194317"
	Class          "K2.5IIIFe-0.5"
	MassSol        1.29
	RadSol         22.31
	Luminosity     186
	Teff           4259
	FeH            0
	Age            3.86

	Orbit
	{
		Period          85.67
		Eccentricity    0.495
		Epoch           2453794
		ArgOfPericenter 357
		MeanAnomaly     0
		//SemiAmplitude   3.23
	}
}

Star	"HD 194317 B"
{
	ParentBody     "HD 194317"
	Class          "F-K" // WD?
	MassSol        1 // 0.7

	Orbit
	{
		Period          85.67
		Eccentricity    0.495
		Epoch           2453794
		ArgOfPericenter 177
		MeanAnomaly     0
	}
}

// 天津增十八(**)
Star	"HD 197177 A"
{
	ParentBody     "HD 197177"
	Class          "G8IIb"

	BinaryOrbit
	{
		Separation      681.72
	}
}

Star	"HD 197177 B"
{
	ParentBody     "HD 197177"
	Class          "B9.9"

	/*BinaryOrbit
	{
		Separation      681.72
	}*/
}

// 天津增十九(**)
Remove "52 Cyg A"{ParentBody "52 Cyg"}
Remove "52 Cyg B"{ParentBody "52 Cyg"}
Star	"HR 7942/HD 197912 A/HIP 102453 A/SAO 70467"
{
	ParentBody     "52 Cyg"
	Class          "G9.5III"
	MassSol        2.07
	RadSol         13.81
	Luminosity     89
	Teff           4677
	FeH            -0.24
	Age            2.27

	BinaryOrbit
	{
		Separation      380.689
	}
}

Star	"TYC 2687-2652-1"
{
	ParentBody     "52 Cyg"
	Class          "A3.8 V"

	/*BinaryOrbit
	{
		Separation      380.689
	}*/
}

// 天津增廿一(SB**)
Star	"HD 196362 A"
{
	ParentBody     "HD 196362"
	Class          "A5III"
	RadSol         4.6
	Luminosity     79.75
	Teff           7888

	Orbit
	{
		PeriodDays      11.088
		Eccentricity    0.28
		Epoch           2426492.6090
		ArgOfPericenter 230.1
		MeanAnomaly     0
		//SemiAmplitude   58.7
	}
}

Star	"HD 196362 B"
{
	ParentBody     "HD 196362"
	Class          "A9.6 V"

	Orbit
	{
		PeriodDays      11.088
		Eccentricity    0.28
		Epoch           2426492.6090
		ArgOfPericenter 50.1
		MeanAnomaly     0
	}
}

// 天津增廿三(SB**)
Remove "30 Vul A"{ParentBody "30 Vul"}
Remove "30 Vul B"{ParentBody "30 Vul"}
Star	"HD 197752 A"
{
	ParentBody     "HD 197752"
	Class          "K1III"
	MassSol        1.55
	RadSol         21.68
	Luminosity     173.3
	Teff           4498
	FeH            -0.1
	Age            4.2

	Orbit
	{
		PeriodDays      2506
		Eccentricity    0.383
		Epoch           2442511.5
		ArgOfPericenter 92
		MeanAnomaly     0
		//SemiAmplitude   4.69
	}
}

Star	"HD 197752 B"
{
	ParentBody     "HD 197752"
	Class          "G7.6 V"

	Orbit
	{
		PeriodDays      2506
		Eccentricity    0.383
		Epoch           2442511.5
		ArgOfPericenter 272
		MeanAnomaly     0
	}
}

// 天津增廿四(SB**)
Star	"HD 198809 A"
{
	ParentBody     "HD 198809"
	Class          "K1III"
	MassSol        2.4
	RadSol         8.01
	Luminosity     52.53
	Teff           5261
	FeH            -0.05
	Age            0.7

	Orbit
	{
		PeriodDays      1860.6
		Eccentricity    0.375
		Epoch           2452316.5
		ArgOfPericenter 195.1
		MeanAnomaly     0
		//SemiAmplitude   4.34
	}
}

Star	"HD 198809 B"
{
	ParentBody     "HD 198809"
	Class          "WD"
	MassSol        0.4

	Orbit
	{
		PeriodDays      1860.6
		Eccentricity    0.375
		Epoch           2452316.5
		ArgOfPericenter 15.1
		MeanAnomaly     0
	}
}

// 天津增廿九(**)
Remove "61 Cyg A"{ParentBody "61 Cyg"}
Remove "61 Cyg B"{ParentBody "61 Cyg"}
Star	"61 Cyg A/V1803 Cyg A/HD 201091/HIP 104214/HR 8085/BD+38 4343/LHS 62/SAO 7091"
{
	ParentBody "ADS 14636"
	Class		   "K5V"
	MassSol			0.7
	RadSol			0.665
	Luminosity  0.153
	Teff        4526
	RotationPeriod	848.88
	FeH			    -0.2
	Age         6.1

	Orbit
	{
		//SemiMajorAxis	11.497263158
		Period			  678
		Eccentricity	0.49
		Inclination		51
		AscendingNode	178
		ArgOfPericenter	329
		MeanAnomaly		0
		Epoch			    2345259.05355283
	}
}

Star	"天津增廿九/61 Cyg B/HD 201092/HIP 104217/HR 8086/BD+38 4344/LHS 63"
{
	ParentBody "ADS 14636"
	Class		   "K7 V"
	MassSol			0.63
	RadSol			0.595
	Luminosity  0.085
	Teff        4077
	FeH			    -0.27
	RotationPeriod	908.16
	Age         6.1

	Orbit
	{
		//SemiMajorAxis	12.774736842
		Period			  678
		Eccentricity	0.49
		Inclination		51
		AscendingNode	178
		ArgOfPericenter	149
		MeanAnomaly		0
		Epoch			    2345259.05355283
	}
}

// 天津增三十(***)
// 基本没做修改
Remove "LAM Cyg A"{ParentBody "LAM Cyg"}
Remove "LAM Cyg B"{ParentBody "LAM Cyg"}
Remove "LAM Cyg Aa"{ParentBody "LAM Cyg A"}
Remove "LAM Cyg Ab"{ParentBody "LAM Cyg A"}
Barycenter "HD 198183 A"
{
	ParentBody "HD 198183"
	BinaryOrbit
	{
		Separation      54.9859
		Eccentricity    0.45
		Inclination     133.8
		AscendingNode   138.6
		ArgOfPericenter 298.4
		Epoch           2376669.882648
		MeanAnomaly     0
	}
}

Star "HD 198183 Aa"
{
	ParentBody "HD 198183 A"
	Class      "B5V"
	MassSol    6.4
	RadSol     3.56
	Teff       13925

	Orbit
	{
		Period          12
		Eccentricity    0.524
		Inclination     135
		AscendingNode   150
		ArgOfPericenter 272
		Epoch           2445039.569838
		MeanAnomaly     0
	}
}

Star "HD 198183 Ab"
{
	ParentBody "HD 198183 A"
	Class      "B5?"
	MassSol    6.4

	Orbit
	{
		Period          12
		Eccentricity    0.524
		Inclination     135
		AscendingNode   150
		ArgOfPericenter 92
		Epoch           2445039.569838
		MeanAnomaly     0
	}
}

Star "HD 198183 B"
{
	ParentBody "HD 198183"
	Class      "B7V"
	MassSol    5.12

	/*BinaryOrbit
	{
		Separation      54.9859
		Eccentricity    0.45
		Inclination     133.8
		AscendingNode   138.6
		ArgOfPericenter 118.4
		Epoch           2376669.882648
		MeanAnomaly     0
	}*/
}

// 天津增卅二(EB**)
Star	"HD 199081 A"
{
	ParentBody     "HD 199081"
	Class          "B5V"
	MassSol        5.54
	RadSol         3.3
	Teff           17190

	Orbit
	{
		PeriodDays      2.8548
		Eccentricity    0.139
		Inclination     48
		Epoch           2441571.275
		ArgOfPericenter 339.6
		MeanAnomaly     0
		//SemiAmplitude   111.9
	}
}

Star	"HD 199081 B"
{
	ParentBody     "HD 199081"
	Class          ""
	MassSol        4.92
	RadSol         2.9

	Orbit
	{
		PeriodDays      2.8548
		Eccentricity    0.139
		Inclination     48
		Epoch           2441571.275
		ArgOfPericenter 159.6
		MeanAnomaly     0
		//SemiAmplitude   111.9
	}
}

// 天津增卅五(Pu*)
Remove "OME1 Cyg (AB)"{ParentBody "OME1 Cyg"}
Remove "OME1 Cyg C"{ParentBody "OME1 Cyg"}
Remove "OME1 Cyg A"{ParentBody "OME1 Cyg (AB)"}
Remove "OME1 Cyg B"{ParentBody "OME1 Cyg (AB)"}

// 天津增卅七(EB**)
Remove "OMI2 Cyg A"{ParentBody "OMI2 Cyg"}
Remove "OMI2 Cyg B"{ParentBody "OMI2 Cyg"}
Star "HD 192909 A"
{
	ParentBody "HIP 99848"
	Class      "K5Iab"
	MassSol    7.45
	RadSol     277
	Luminosity 16600 // 17540
	Teff       3986
	FeH        -0.43
	Age        0.02

	Orbit
	{
		PeriodDays      1147.8
		Eccentricity    0.3
		Inclination     65.5
		Epoch           2433141.8
		ArgOfPericenter 38.2
		MeanAnomaly     0
	}
}

Star "HD 192910 B"
{
	ParentBody "HIP 99848"
	Class      "B7V"
	MassSol    4.13
	RadSol     3
	Luminosity 302
	Teff       16200

	Orbit
	{
		PeriodDays      1147.8
		Eccentricity    0.3
		Inclination     65.5
		Epoch           2433141.8
		ArgOfPericenter 218.2
		MeanAnomaly     0
	}
}

// 天津增卅八(EB**)
Remove "OMI1 Cyg A"{ParentBody "OMI1 Cyg"}
Remove "OMI1 Cyg B"{ParentBody "OMI1 Cyg"}
Star "HD 192577 A"
{
	ParentBody "HD 192577"
	Class      "K4Iab"
	MassSol    6.73
	RadSol     127
	Luminosity 2512 // 2559
	Teff       4043

	Orbit
	{
		PeriodDays      3784.3
		Eccentricity    0.2084
		Epoch           2452345
		ArgOfPericenter 24.4
		MeanAnomaly     0
		//SemiAmplitude   13.94
	}
}

Star "HD 192577 B"
{
	ParentBody "HD 192577"
	Class      "B4IV"
	MassSol    5.22
	RadSol     5.2
	Teff       16500
	Age        0.0398

	Orbit
	{
		PeriodDays      3784.3
		Eccentricity    0.2084
		Epoch           2452345
		ArgOfPericenter 204.4
		MeanAnomaly     0
	}
}

// 天津增卅九(LP**)
Star "HD 198134 A"
{
	ParentBody "HD 198134"
	Class      "K3III"
	RadSol     28.19
	Luminosity 241.1
	Teff       4285
	FeH        -0.12

	BinaryOrbit
	{
		Epoch           2455927.43978347
		Separation      963.9
		PositionAngle   120
	}

	BinaryOrbit
	{
		Epoch           2406619.74294804
		Separation      1190
		PositionAngle   121
	}
}

Star "HD 198134 B"
{
	ParentBody "HD 198134"
	Class      "B9.9 V"

	/*BinaryOrbit
	{
		Epoch           2455927.43978347
		Separation      963.9
		PositionAngle   120
	}

	BinaryOrbit
	{
		Epoch           2406619.74294804
		Separation      1190
		PositionAngle   121
	}*/
}

// 奚仲增一(**)
Star	"HD 183534 A"
{
	ParentBody     "HD 183534"
	Class          "A1V"
	MassSol        2.59
	Luminosity     74.1
	Teff           9683
	Age            0.404

	Orbit
	{
		RefPlane        "Equator"
		Period          939.955536
		Eccentricity    0.57226789
		Inclination     -0.321259737
		AscendingNode   0
		ArgOfPericenter -42.604563
		MeanAnomaly     -54.0038074
	}
}

Star	"HD 183534 B"
{
	ParentBody     "HD 183534"
	Class          "A8.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          939.955536
		Eccentricity    0.57226789
		Inclination     -0.321259737
		AscendingNode   0
		ArgOfPericenter 137.395437
		MeanAnomaly     -54.0038074
	}
}

// 扶筐增一(**)
Star	"HD 168151 A"
{
	ParentBody     "HD 168151"
	Class          "F5V"
	MassSol        1.23
	RadSol         1.635
	Luminosity     4.66
	Teff           6638
	FeH            -0.3
	Age            2.95

	BinaryOrbit
	{
		Separation      75.636
	}
}

Star	"HD 168151 B"
{
	ParentBody     "HD 168151"
	Class          "M3"

	/*BinaryOrbit
	{
		Separation      75.636
	}*/
}

// 扶筐增二(*Pl)
Remove "Orbitar"{ParentBody "Fafnir"}
Planet	"HD 170693 b"
{
	ParentBody     "HD 170693"
	DiscMethod     "RadVel"
	DiscDate       "2009" // Doellinger et al., TLS, 2009.03.20
	Mass           1233.1741144

	Orbit
	{
		//aphelion distance 1.64
		PericenterDist  0.74
		SemiMajorAxis   1.19
		Eccentricity    0.38
		PeriodDays      479.1
		Epoch           2452757.4
		ArgOfPericenter 218.7
		MeanAnomaly     0
	}
}

// 代增二(**)
Star	"HD 206356 A"
{
	ParentBody     "HD 206356"
	Class          "K0III"
	MassSol        2.55
	Luminosity     48.25
	Teff           4910
	FeH            -0.01
	Age            0.55

	BinaryOrbit
	{
		Separation      288.75
	}
}

Star	"HD 206356 B"
{
	ParentBody     "HD 206356"
	Class          "A9.6 V"

	/*BinaryOrbit
	{
		Separation      288.75
	}*/
}
