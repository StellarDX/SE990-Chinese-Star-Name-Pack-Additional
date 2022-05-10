// 危宿增十四(**)
Star	"HD 209288 A"
{
	ParentBody     "HD 209288"
	Class          "B5III"
  AbsMagn        -1.72

	Orbit
	{
		RefPlane        "Equator"
		Period          483.781456
		Eccentricity    0.375356972
		Inclination     2.06007782
		AscendingNode   0
		ArgOfPericenter 108.690022
		MeanAnomaly     -73.0035153
	}
}

Star	"HD 209288 B"
{
	ParentBody     "HD 209288"
	Class          "B7.3 V"

  Orbit
	{
		RefPlane        "Equator"
		Period          483.781456
		Eccentricity    0.375356972
		Inclination     2.06007782
		AscendingNode   0
		ArgOfPericenter 288.690022
		MeanAnomaly     -73.0035153
	}
}

// 坟墓增一(SB***)
Barycenter "HD 212754 A"
{
	ParentBody "HD 212754"
	BinaryOrbit
	{
		Epoch           2457023.16637981
		Period          420
		PositionAngle   226.2
	}
}

Star	"HD 212754 Aa"
{
	ParentBody     "HD 212754 A"
	Class          "F7V"
  MassSol        1.33
	RadSol         2.25
	Luminosity     6.7
	Teff           6200
	FeH            -0.04
	Age            3.22

	Orbit
	{
		PeriodDays      929.91
		Eccentricity    0.4358
		Inclination     94
		AscendingNode   101.6
		Epoch           2453294.4
		ArgOfPericenter 8.5
		MeanAnomaly     0
		//SemiAmplitude   5.06
	}
}

Star	"HD 212754 Ab"
{
	ParentBody     "HD 212754 A"
	Class          "dM"
	MassSol        0.29

  Orbit
	{
		PeriodDays      929.91
		Eccentricity    0.4358
		Inclination     94
		AscendingNode   101.6
		Epoch           2453294.4
		ArgOfPericenter 188.5
		MeanAnomaly     0
	}
}

Star	"HD 212754 B"
{
	ParentBody     "HD 212754"
	Class          "K4"
	MassSol        0.53

	/*BinaryOrbit
	{
		Epoch           2457023.16637981
		Period          420
		PositionAngle   226.2
	}*/
}

// 坟墓增三(**)
Star	"HD 213235 A"
{
	ParentBody     "HD 213235"
	Class          "F8V"

	BinaryOrbit
	{
		Separation      35.51
	}
}

Star	"HD 213235 B"
{
	ParentBody     "HD 213235"
	Class          "A4V"

	/*BinaryOrbit
	{
		Separation      35.51
	}*/
}

// 杵增二(**)
Star	"HD 213323 A"
{
	ParentBody     "HD 213323"
	Class          "B9.5V"

	Orbit
	{
		RefPlane        "Equator"
		Period          853.630791
		Eccentricity    0.663600504
		Inclination     2.09284011
		AscendingNode   0
		ArgOfPericenter 100.086112
		MeanAnomaly     124.140938
	}
}

Star	"HD 213323 B"
{
	ParentBody     "HD 213323"
	Class          "A3.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          853.630791
		Eccentricity    0.663600504
		Inclination     2.09284011
		AscendingNode   0
		ArgOfPericenter 280.086112
		MeanAnomaly     124.140938
	}
}

// 臼增一(SB**)
Star	"HD 207650 A"
{
	ParentBody     "HD 207650"
	Class          "A1V"

	Orbit
	{
		RefPlane        "Equator"
		Period          46.9246833
		Eccentricity    0.14157784
		Inclination     1.43787575
		AscendingNode   0
		ArgOfPericenter -18.7945891
		MeanAnomaly     177.224551
	}
}

Star	"HD 207650 B"
{
	ParentBody     "HD 207650"
	Class          "F3.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          46.9246833
		Eccentricity    0.14157784
		Inclination     1.43787575
		AscendingNode   0
		ArgOfPericenter 161.205411
		MeanAnomaly     177.224551
	}
}

// 车府增二(Be**(EB?))
Star	"HD 200310 A"
{
	ParentBody     "HD 200310"
	Class          "B1Ve"

	Orbit
	{
		RefPlane        "Equator"
		Period          516.588906
		Eccentricity    0.281610996
		Inclination     -1.93641806
		AscendingNode   0
		ArgOfPericenter 60.5062695
		MeanAnomaly     -178.5569
	}
}

Star	"HD 200310 B"
{
	ParentBody     "HD 200310"
	Class          "B9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          516.588906
		Eccentricity    0.281610996
		Inclination     -1.93641806
		AscendingNode   0
		ArgOfPericenter 240.506269
		MeanAnomaly     -178.5569
	}
}

// 车府增五(**)
Star	"HD 206330 A"
{
	ParentBody     "HD 206330"
	Class          "M1IIIab"
	RadSol         44.61
	Luminosity     438.5
	Teff           3954

	BinaryOrbit
	{
		Epoch           2454466.47098835
		Separation      359.1
	}
}

Star	"HD 206330 B"
{
	ParentBody     "HD 206330"
	Class          "A8.8 V"

	/*BinaryOrbit
	{
		Epoch           2454466.47098835
		Separation      359.1
	}*/
}

// 车府增六(SB**)
Star	"HD 206644 A"
{
	ParentBody     "HD 206644"
	Class          "A0V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00473583746
		Eccentricity    0
		Inclination     -0.596383095
		AscendingNode   0
		ArgOfPericenter 59.4881481
		MeanAnomaly     41.9202682
	}
}

Star	"HD 206644 B"
{
	ParentBody     "HD 206644"
	Class          "A0V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00473583746
		Eccentricity    0
		Inclination     -0.596383095
		AscendingNode   0
		ArgOfPericenter 239.488148
		MeanAnomaly     41.9202682
	}
}

// 车府增八(PM**)
Star	"HD 205512 A"
{
	ParentBody     "HD 205512"
	Class          "K0.5IIICN0.5"
	MassSol        1.7
	RadSol         14
	Luminosity     69
	Teff           4640
	FeH            0.18
	Age            0.9

	BinaryOrbit
	{
		Separation      4690
	}
}

Star	"HD 205512 B"
{
	ParentBody     "HD 205512"
	Class          "M5V"

	/*BinaryOrbit
	{
		Separation      4690
	}*/
}

// 车府增九(SB**)
Star	"HD 213420 A"
{
	ParentBody     "HD 213420"
	Class          "B2IV"
	MassSol        12.5
	RadSol         6.9
	LumBol         34590
	Teff           21150
	FeH            -0.04
	Age            0.0157

	Orbit
	{
		PeriodDays      880
		Eccentricity    0.3
		Epoch           2416300
		ArgOfPericenter 10
		MeanAnomaly     0
		//SemiAmplitude   9
	}
}

Star	"HD 213420 B"
{
	ParentBody     "HD 213420"
	Class          "B0.5 V"

	Orbit
	{
		PeriodDays      880
		Eccentricity    0.3
		Epoch           2416300
		ArgOfPericenter 190
		MeanAnomaly     0
	}
}

// 车府增十(Be**)
Star	"HD 214167 A"
{
	ParentBody     "HD 214167"
	Class          "B1IVe"

	BinaryOrbit
	{
		Separation      4380.6
	}
}

Star	"HD 214167 B"
{
	ParentBody     "HD 214167"
	Class          "B1.Vs"

	/*BinaryOrbit
	{
		Separation      4380.6
	}*/
}

// 车府增十二(bC**)
Star	"HD 214993 A"
{
	ParentBody     "HD 214993"
	Class          "B1.5III"
	MassSol        9.5
	RadSol         8.4
	AbsMagn        -3.02
	LumBol         8877
	Teff           23809
	FeH            -0.41
	Age            0.0218

	BinaryOrbit
	{
		Separation      26910
	}
}

Star	"HD 214993 B"
{
	ParentBody     "HD 214993"
	Class          "A3V"

	/*BinaryOrbit
	{
		Separation      26910
	}*/
}

// 车府增十四(EB**)
Star	"HD 216200 A"
{
	ParentBody     "HD 216200"
	Class          "B4"
	MassSol        7.45
	DimensionsSol  (15.1, 15.1, 15.1) // Polar: 15.1
	Temperature    (18000, 18000, 18000)
	Teff           18000

	Orbit
	{
		PeriodDays      10.085415
		Eccentricity    0
		Epoch           2441170.285
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   25.8
	}
}

Star	"HD 216200 B"
{
	ParentBody     "HD 216200"
	Class          "F9III"
	MassSol        1.21
	DimensionsSol  (17.7, 17.7, 17.7) // Polar: 17.7
	Temperature    (6000, 6000, 6000)
	Teff           6000

	Orbit
	{
		PeriodDays      10.085415
		Eccentricity    0
		Epoch           2441170.285
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   159.2
	}
}

// 车府增十五(bC***)
Barycenter "HD 216916 A"
{
	ParentBody "HD 216916"
	BinaryOrbit
	{
		Separation      13248
	}
}

Star	"HD 216916 Aa"
{
	ParentBody     "HD 216916 A"
	Class          "B2IV"
  MassSol        9.5
	RadSol         5.6
	Luminosity     7762
	Teff           23000
	FeH            0

	Orbit
	{
		PeriodDays      12.0969
		Eccentricity    0.0539
		//Epoch           61.4 // ?
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   23.85
	}
}

Star	"HD 216916 Ab"
{
	ParentBody     "HD 216916 A"
	Class          "F6"

  Orbit
	{
		PeriodDays      12.0969
		Eccentricity    0.0539
		//Epoch           61.4 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 216916 B"
{
	ParentBody     "HD 216916"
	Class          "F0"

	/*BinaryOrbit
	{
		Separation      13248
	}*/
}

// 车府增十六(Be****)
Remove "OMI And A"{ParentBody "OMI And"}
Remove "OMI And B"{ParentBody "OMI And"}
Remove "OMI And Aa"{ParentBody "OMI And A"}
Remove "OMI And Ab"{ParentBody "OMI And A"}
Remove "OMI And Ba"{ParentBody "OMI And B"}
Remove "OMI And Bb"{ParentBody "OMI And B"}
Barycenter "OMI And A/HD 217675"
{
	ParentBody "CDS 1436"
	BinaryOrbit
	{
		Period          117.4
		Eccentricity    0.371
		Inclination     109.6
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 217675 A"
{
	ParentBody     "HD 217675"
	Class          "B6IIIpe"
  MassSol        3.6 // 2.9
	RadSol         6.6
	Luminosity     1380
	Teff           13800

	Orbit
	{
		Period          5.6
		Eccentricity    0.22
		Inclination     152
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 217675 B"
{
	ParentBody     "HD 217675"
	Class          ""
	MassSol        2.4

  Orbit
	{
		Period          5.6
		Eccentricity    0.22
		Inclination     152
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "OMI And B/HD 217676"
{
	ParentBody "CDS 1436"
	/*BinaryOrbit
	{
		Period          117.4
		Eccentricity    0.371
		Inclination     109.6
		ArgOfPericenter 180
		MeanAnomaly     0
	}*/
}

Star	"HD 217676 A"
{
	ParentBody     "HD 217676"
	Class          "A2Vp"
  MassSol        3.6
	Age            0.0501

	Orbit
	{
		PeriodDays      33.01
		Eccentricity    0.24
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   54.8
	}
}

Star	"HD 217676 B"
{
	ParentBody     "HD 217676"
	Class          ""
	MassSol        2.4 // ?

  Orbit
	{
		PeriodDays      33.01
		Eccentricity    0.24
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   71.6
	}
}

// 车府增十七(**)
Remove "2 And A"{ParentBody "2 And"}
Remove "2 And B"{ParentBody "2 And"}
Star "HD 217782 A"
{
	ParentBody "HD 217782"
	Class      "A1V"
	MassSol    2.7
	Luminosity 130.5
	Teff       8950
	Age        0.1

	Orbit
	{
		Period          73.997
		Eccentricity    0.8
		Inclination     21.7
		AscendingNode   159.5
		Epoch           2404165.31537223
		ArgOfPericenter 176.4
		MeanAnomaly     0
	}
}

Star "HD 217782 B"
{
	ParentBody "HD 217782"
	Class      "F1V"
	MassSol    1.78
	Teff       7720

	Orbit
	{
		Period          73.997
		Eccentricity    0.8
		Inclination     21.7
		AscendingNode   159.5
		Epoch           2404165.31537223
		ArgOfPericenter 356.4
		MeanAnomaly     0
	}
}

// 车府增十八(PM**)
Star "HD 218804 A"
{
	ParentBody "HD 218804"
	Class      "F5V"
	MassSol    1.3
	RadSol     1.5
	Luminosity 3.09
	Teff       6425
	FeH        -0.19
	Age        2.91

	Orbit
	{
		PeriodDays      3373
		Epoch           2453116.5
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   8.75
	}
}

Star "HD 218804 B"
{
	ParentBody "HD 218804"
	Class      ""
	MassSol    1

	Orbit
	{
		PeriodDays      3373
		Epoch           2453116.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 车府增十九(RSG**)
Remove "5 Lac A"{ParentBody "5 Lac"}
Remove "5 Lac B"{ParentBody "5 Lac"}
Star "HD 213311"
{
	ParentBody "V412 Lac"
	Class      "K9Ia"
	MassSol    5.11
	RadSol     319.2
	Luminosity 17473
	Teff       3713
	Age        0.11

	Orbit
	{
		Period          41.95
		Eccentricity    0.49
		Epoch           2427578.3
		ArgOfPericenter 143
		MeanAnomaly     0
		//SemiAmplitude   12.2
	}
}

Star "HD 213310"
{
	ParentBody "V412 Lac"
	Class      "B2V"
	//Teff       7580

	Orbit
	{
		Period          41.95
		Eccentricity    0.49
		Epoch           2427578.3
		ArgOfPericenter 323
		MeanAnomaly     0
		//SemiAmplitude   112
	}
}

// 天钩增三(EB**)
// Ref: https://ui.adsabs.harvard.edu/abs/1976PASP...88...86W/abstract
Star "HD 193964 A"
{
	ParentBody "HD 193964"
	Class      "B9V"

	Orbit
	{
		PeriodDays      5.29807
		Eccentricity    0
		Epoch           2442377.408
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 193964 B"
{
	ParentBody "HD 193964"
	Class      "A3.5 V"

	Orbit
	{
		PeriodDays      5.29807
		Eccentricity    0
		Epoch           2442377.408
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 造父增一(SB**)
Remove "14 Cep A"{ParentBody "14 Cep"}
Remove "14 Cep B"{ParentBody "14 Cep"}
Star "HD 209481 A"
{
	ParentBody "HD 209481"
	Class      "O9IV(n)var"
	MassSol    30.4
	RadSol     15
	LumBol     226000
	Teff       34280

	Orbit
	{
		PeriodDays      3070
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 209481 B"
{
	ParentBody "HD 209481"
	Class      "B1:V:"

	Orbit
	{
		PeriodDays      3070
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 造父增二(**)
Star "HD 210220 A"
{
	ParentBody "HD 210220"
	Class      "G8.6III"
	MassSol    2.97
	Teff       5261
	Age        0.35

	Orbit
	{
		PeriodDays      737.4
		Eccentricity    0.308
		Epoch           2454113.8
		ArgOfPericenter 241.9
		MeanAnomaly     0
		//SemiAmplitude   5.55
	}
}

Star "HD 210220 B"
{
	ParentBody "HD 210220"
	Class      "A8.1 V"

	Orbit
	{
		PeriodDays      737.4
		Eccentricity    0.308
		Epoch           2454113.8
		ArgOfPericenter 61.9
		MeanAnomaly     0
	}
}

// 造父增三(**)
Star	"HD 209744 A"
{
	ParentBody     "HD 209744"
	Class          "B1V"

	Orbit
	{
		RefPlane        "Equator"
		Period          3995.47108
		Eccentricity    0.682919025
		Inclination     0.536127806
		AscendingNode   0
		ArgOfPericenter 42.9414198
		MeanAnomaly     -103.456783
	}
}

Star	"HD 209744 B"
{
	ParentBody     "HD 209744"
	Class          "A1.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          3995.47108
		Eccentricity    0.682919025
		Inclination     0.536127806
		AscendingNode   0
		ArgOfPericenter 222.94142
		MeanAnomaly     -103.456783
	}
}

// 天钱增一(Be**)
Star	"HD 209014 A"
{
	ParentBody     "HD 209014"
	Class          "B8III_sh"
	MassSol        4.01
	Luminosity     604
	Teff           11272
	Age            0.115

	BinaryOrbit
	{
		Epoch           2451545
		Separation      454.5
		PositionAngle   113.4
	}
}

Star	"HD 209014 B"
{
	ParentBody     "HD 209014"
	Class          "B8.5IV"

	/*BinaryOrbit
	{
		Epoch           2451545
		Separation      454.5
		PositionAngle   113.4
	}*/
}
