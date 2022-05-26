// 参宿增二(V**)
Star "HD 36167 A"
{
	ParentBody "HD 36167"
	Class      "K5III"
	RadSol     60.07
  Luminosity 763.4
	Teff       3914.5
  FeH        -0.21

	BinaryOrbit
	{
    Separation      1917.7
	}
}

Star "HD 36167 B"
{
	ParentBody "HD 36167"
	Class      "F7V"

  /* BinaryOrbit
	{
    Separation      1917.7
	} */
}

// 参宿增三(EB**)
Barycenter "HD 35411 A"
{
	ParentBody "HD 35411"
	BinaryOrbit
	{
		Period          1800
	}
}

Barycenter "HD 35411 Aab"
{
	ParentBody "HD 35411 A"
	Orbit
	{
		Period          9.442
    Eccentricity    0.45
    Inclination     102.8
    ArgOfPericenter 0
    MeanAnomaly     0
	}
}

Star "HD 35411 Aa"
{
	ParentBody "HD 35411 Aab"
	Class      "B1V"
  MassSol    11
  RadSol     6.3
  Teff       26600

  Orbit
	{
		PeriodDays      7.989255
    Eccentricity    0.011
    Inclination     85
    ArgOfPericenter 0
    MeanAnomaly     0
    //SemiAmplitude   145.5
	}
}

Star "HD 35411 Ab"
{
	ParentBody "HD 35411 Aab"
	Class      "B3V"
  MassSol    10.6
  RadSol     5.2
  Teff       26600

  Orbit
	{
		PeriodDays      7.989255
    Eccentricity    0.011
    Inclination     85
    ArgOfPericenter 180
    MeanAnomaly     0
    //SemiAmplitude   150
	}
}

Star "HD 35411 Ac"
{
	ParentBody "HD 35411 A"
	Class      "B3V"
  MassSol    6.78

  Orbit
	{
		Period          9.442
    Eccentricity    0.45
    Inclination     102.8
    ArgOfPericenter 180
    MeanAnomaly     0
	}
}

Star "HD 35411 B"
{
	ParentBody "HD 35411"
	Class      "B2V"
  MassSol    8.7

  /* BinaryOrbit
	{
		Period          1800
	} */
}

// 参宿增四(SB**)
Star	"HD 35410 A"
{
	ParentBody     "HD 35410"
	Class          "G9III"
  MassSol        1.56
  RadSol         7.24
  Luminosity     35.73
  Teff           4897.79
  FeH            -0.27

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0203674647
		Eccentricity    0
		Inclination     -2.15448475
		AscendingNode   0
		ArgOfPericenter -27.89732
		MeanAnomaly     50.8284869
	}
}

Star	"HD 35410 B"
{
	ParentBody     "HD 35410"
	Class          "WD" // ?

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0203674647
		Eccentricity    0
		Inclination     -2.15448475
		AscendingNode   0
		ArgOfPericenter 152.10268
		MeanAnomaly     50.8284869
	}
}

// 参宿增五(SB**)
Remove "22 Ori Aa"{ParentBody "22 Ori"}
Remove "22 Ori Ab"{ParentBody "22 Ori"}
Star	"HD 35039 A"
{
	ParentBody     "HD 35039"
	Class          "B2IV"
  MassSol        9
  Luminosity     741
  Teff           19953
  FeH            -0.06
  Age            0.0185

	Orbit
	{
		PeriodDays      293
		Eccentricity    0.15
		Epoch           2442175
		ArgOfPericenter 54
		MeanAnomaly     0
    //SemiAmplitude   4.1
	}
}

Star	"HD 35039 B"
{
	ParentBody     "HD 35039"
	Class          "B1.8 V"

	Orbit
	{
    PeriodDays      293
		Eccentricity    0.15
		Epoch           2442175
		ArgOfPericenter 234
		MeanAnomaly     0
	}
}

// 参宿增九(**)
Star	"HD 33856 A"
{
	ParentBody     "HD 33856"
	Class          "K0III"
  MassSol        2.67
	RadSol         25
  Luminosity     251
  Teff           4533
  FeH            0.66
  Age            0.65

	Orbit
	{
		PeriodDays      1031.4
		Eccentricity    0.1
		Inclination     122.8
		AscendingNode   242.6
		Epoch           2426182.46
		ArgOfPericenter 197.9
		MeanAnomaly     0
    //SemiAmplitude   8.7
	}
}

Star	"HD 33856 B"
{
	ParentBody     "HD 33856"
	Class          "F2.9 V"

	Orbit
	{
		PeriodDays      1031.4
		Eccentricity    0.1
		Inclination     122.8
		AscendingNode   242.6
		Epoch           2426182.46
		ArgOfPericenter 17.9
		MeanAnomaly     0
	}
}

// 参宿增十(SB**)
Star	"23 Ori A/BD+03 871/HD 35149/HIP 25142/HR 1770/SAO 112697 A"
{
	ParentBody     "WDS J05228+0333"
	Class          "B1V"
  MassSol        12.5
	RadSol         6.97
  Luminosity     26546
  Teff           25400
  Age            0.0154

	BinaryOrbit
	{
		Epoch           2458118.89297616
		Separation      9460
		PositionAngle   30
	}
}

Star	"23 Ori B/BD+03 872/HD 35148/HIP 25145/SAO 112699"
{
	ParentBody     "WDS J05228+0333"
	Class          "B3V"
	MassSol        6.6
	RadSol         4.71
	Luminosity     1620
	Teff           18700
	Age            0.0228

	/* BinaryOrbit
	{
		Epoch           2458118.89297616
		Separation      9460
		PositionAngle   30
	} */
}

// 参宿增十一(bC**)
Star	"HD 35715 A"
{
	ParentBody     "HD 35715"
	Class          "B1III"
	MassSol        9.6
	Oblateness     0
	Luminosity     10252
  Teff           25000
	Age            11.4

	Orbit
	{
		PeriodDays      2.529
		Eccentricity    0.053
		Inclination     58
		Epoch           2450774
		ArgOfPericenter 352
		MeanAnomaly     0
		//SemiAmplitude   145
	}
}

Star	"HD 35715 B"
{
	ParentBody     "HD 35715"
	Class          "B2V"
	MassSol        7.06
	Teff           22500

	Orbit
	{
		PeriodDays      2.529
		Eccentricity    0.053
		Inclination     58
		Epoch           2450774
		ArgOfPericenter 172
		MeanAnomaly     0
		//SemiAmplitude   237
	}
}

// 参宿增十二(**)
Star	"HD 36351 A"
{
	ParentBody     "HD 36351"
	Class          "B3II"
	RadSol         4.01
	AbsMagn        -2.66
  Teff           14786

	BinaryOrbit
	{
		Separation      658.533
	}
}

Star	"HD 36351 B"
{
	ParentBody     "HD 36351"
	Class          "A1.8 V"

	/* BinaryOrbit
	{
		Separation      658.533
	} */
}

// 参宿增十三(***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=36267
Barycenter "HD 36267 A"
{
	ParentBody "HD 36267"
	BinaryOrbit
	{
		Period          613.69
		Epoch           2560032.42370202
		Eccentricity    0.221
		AscendingNode   217.1
		ArgOfPericenter 302.5
		Inclination     96.6
		MeanAnomaly     0
	}
}

Star	"HD 36267 Aa"
{
	ParentBody     "HD 36267 A"
	Class          "B5V"
	MassSol        5
	RadSol         2.9
	Luminosity     388
  Teff           16020
	Age            0.065

	Orbit
	{
		PeriodDays      3.9637
		Epoch           2444996
		Eccentricity    0.38
		ArgOfPericenter 117
		MeanAnomaly     0
	}
}

Star	"HD 36267 Ab"
{
	ParentBody     "HD 36267 A"
	Class          ""
	MassSol        0.57

	Orbit
	{
		PeriodDays      3.9637
		Epoch           2444996
		Eccentricity    0.38
		ArgOfPericenter 297
		MeanAnomaly     0
	}
}

Star	"HD 36267 B"
{
	ParentBody     "HD 36267"
	Class          "B7V"
	MassSol        2.82

	/* BinaryOrbit
	{
		Period          613.69
		Epoch           2560032.42370202
		Eccentricity    0.221
		AscendingNode   217.1
		ArgOfPericenter 122.5
		Inclination     96.6
		MeanAnomaly     0
	} */
}

// 参宿增十四(**)
Star	"HD 36777 A"
{
	ParentBody     "HD 36777"
	Class          "A1V"
	RadSol         2.86
	Luminosity     47.4
	Teff           8917

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00867690343
		Eccentricity    0
		Inclination     1.62555718
		AscendingNode   0
		ArgOfPericenter -101.599828
		MeanAnomaly     -106.178079
	}
}

Star	"HD 36777 B"
{
	ParentBody     "HD 36777"
	Class          "F1.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00867690343
		Eccentricity    0
		Inclination     1.62555718
		AscendingNode   0
		ArgOfPericenter 78.4001723
		MeanAnomaly     -106.178079
	}
}

// 参宿增十七(**)
Star	"HD 38710 A"
{
	ParentBody     "HD 38710"
	Class          "A5V"
	RadSol         1.89
	Luminosity     168.37
  Teff           7593

	BinaryOrbit
	{
		Separation      189.773
	}
}

Star	"HD 38710 B"
{
	ParentBody     "HD 38710"
	Class          "A5V"
	RadSol         1.89

	/* BinaryOrbit
	{
		Separation      189.773
	} */
}

// 参宿增十八(SB****)
Remove "MU Ori A"{ParentBody "MU Ori"}
Remove "MU Ori B"{ParentBody "MU Ori"}
Remove "MU Ori Aa"{ParentBody "MU Ori A"}
Remove "MU Ori Ab"{ParentBody "MU Ori A"}
Remove "MU Ori Ba"{ParentBody "MU Ori B"}
Remove "MU Ori Bb"{ParentBody "MU Ori B"}
Barycenter "HD 40932 A"
{
	ParentBody "ADS 4617"
	BinaryOrbit
	{
		PeriodDays      6813.8
		Separation      12.62
		Eccentricity    0.741
		Inclination     96.028
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HD 40932 B"
{
	ParentBody "ADS 4617"
	/* Orbit
	{
		PeriodDays      6813.8
		Separation      12.62
		Eccentricity    0.741
		Inclination     96.028
		ArgOfPericenter 180
		MeanAnomaly     0
	} */
}

Star "HD 40932 Aa"
{
	ParentBody "HD 40932 A"
	Class      "A1Vm"
	MassSol    2.38
	RadSol     2.85
	Luminosity 32.2
	Teff       8300
	Age        0.282

	Orbit
	{
		PeriodDays      4.4475849
		//Separation      0.07659
		Eccentricity    0.0037
		Inclination     47.1
		AscendingNode   50.5
		ArgOfPericenter 304
		Epoch           2443739.69
		MeanAnomaly     0
	}
}

Star "HD 40932 Ab"
{
	ParentBody "HD 40932 A"
	Class      "G5V"
	MassSol    0.652

	Orbit
	{
		PeriodDays      4.4475849
		//Separation      0.07659
		Eccentricity    0.0037
		Inclination     47.1
		AscendingNode   50.5
		ArgOfPericenter 124
		Epoch           2443739.69
		MeanAnomaly     0
	}
}

Star "HD 40932 Ba"
{
	ParentBody "HD 40932 B"
	Class      "F5V"
	MassSol    1.389
	RadSol     1.33
	Luminosity 3
	Teff       6600

	Orbit
	{
		PeriodDays      4.7835349
		//Separation      0.07659
		Eccentricity    0.0016
		Inclination     110.71
		AscendingNode   111.3
		ArgOfPericenter 217
		Epoch           2443746.4
		MeanAnomaly     0
	}
}

Star "HD 40932 Bb"
{
	ParentBody "HD 40932 B"
	Class      "F5V"
	MassSol    1.356
	RadSol     1.33
	Luminosity 3
	Teff       6600

	Orbit
	{
		PeriodDays      4.7835349
		//Separation      0.07659
		Eccentricity    0.0016
		Inclination     110.71
		AscendingNode   111.3
		ArgOfPericenter 37
		Epoch           2443746.4
		MeanAnomaly     0
	}
}

// 参宿增二十(SB**)
Remove "66 Ori A"{ParentBody "66 Ori"}
Remove "66 Ori B"{ParentBody "66 Ori"}
Star "HD 41380 A"
{
	ParentBody "GC 7704"
	Class      "G6II"
	RadSol     148.38
	AbsMagn    -2.83
	FeH        -0.22

	Orbit
	{
		Period          2.9892
		Eccentricity    0.246
		Inclination     105.6
		AscendingNode   20.6
		ArgOfPericenter 223.1
		Epoch           2451788
		MeanAnomaly     0
	}
}

Star "HD 41380 B"
{
	ParentBody "GC 7704"
	Class      "A2.4 V"

	Orbit
	{
		Period          2.9892
		Eccentricity    0.246
		Inclination     105.6
		AscendingNode   20.6
		ArgOfPericenter 43.1
		Epoch           2451788
		MeanAnomaly     0
	}
}

// 参宿增廿六(***)
Remove "BET Mon BC"{ParentBody "BET Mon"}
Remove "BET Mon A"{ParentBody "BET Mon"}
Remove "BET Mon B"{ParentBody "BET Mon BC"}
Remove "BET Mon C"{ParentBody "BET Mon BC"}
// 丹霞：这个系统的轨道数据Wikipedia和NOIRLab都只字未提。
// 而且NOIRLab还提到C有一颗伴星Cb，是SOAR天文台在1988年的一次散斑干涉测量时发现的。
// 但是Wikipedia又说之后的几次红外观测没发现这颗伴星
Star "BET Mon A/BET1 Mon/BD-06 1574/GC 8412/HD 45725/HR 2356"
{
	ParentBody "CCDM J06288-0702"
	Class      "B4Veshell"
	MassSol    8.7
	Luminosity 3200
	Teff       18070
	Age        0.0275

	Orbit
	{
		RefPlane        "Static"
	}
}

Star "BET Mon B/BD-06 1575B/HD 45726/HR 2357"
{
	ParentBody "CCDM J06288-0702"
	Class      "B2vn(e)"
	MassSol    6.2
	Luminosity 1600

	Orbit
	{
		SemiMajorAxis   1497.3
		ArgOfPericenter 135
		MeanAnomaly     0
	}
}

Star "BET Mon C/BD-06 1575C/HD 45727/HR 2358"
{
	ParentBody "CCDM J06288-0702"
	Class      "B3V:nne"
	MassSol    6
	Luminosity 1300

	Orbit
	{
		SemiMajorAxis   2081.1
		ArgOfPericenter 130
		MeanAnomaly     0
	}
}

// 参宿增廿七(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=30073
Barycenter "HD 44112 A"
{
	ParentBody "HD 44112"
	BinaryOrbit
	{
		Period          28.635
		//Separation      16.0412
	}
}

Star "HD 44112 Aa"
{
	ParentBody "HD 44112 A"
	Class      "B2V"
	RadSol     3.37
	Luminosity 1566.07
	Teff       14786

	Orbit
	{
		PeriodDays      15.78
		Epoch           2444451.801
		Eccentricity    0.3
		ArgOfPericenter 75
		MeanAnomaly     0
	}
}

Star "HD 44112 Ab"
{
	ParentBody "HD 44112 A"
	Class      ""
	MassSol    2.33

	Orbit
	{
		PeriodDays      15.78
		Epoch           2444451.801
		Eccentricity    0.3
		ArgOfPericenter 255
		MeanAnomaly     0
	}
}

Star "HD 44112 B"
{
	ParentBody "HD 44112"
	Class      ""
	MassSol    4.81

	/* BinaryOrbit
	{
		Period          28.635
		//Separation      16.0412
	} */
}

// 参宿增廿八(**)
Star "HD 43232 A"
{
	ParentBody "HD 43232"
	Class      "K1III"
	Luminosity 1021
	Teff       4375
	FeH        -0.15

	Orbit
	{
		RefPlane        "Equator"
		Period          78.3110257
		Eccentricity    0.77112323
		Inclination     -1.30367303
		AscendingNode   0
		ArgOfPericenter 148.722189
		MeanAnomaly     128.886754
	}
}

Star "HD 43232 B"
{
	ParentBody "HD 43232"
	Class      "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          78.3110257
		Eccentricity    0.77112323
		Inclination     -1.30367303
		AscendingNode   0
		ArgOfPericenter 328.722189
		MeanAnomaly     128.886754
	}
}

// 参宿增卅一(**)
Remove "3 Mon A"{ParentBody "3 Mon"}
Remove "3 Mon B"{ParentBody "3 Mon"}
Star "HD 40967 A"
{
	ParentBody "HD 40967"
	Class      "B5III"
	MassSol    5.85
	RadSol     4.5
	Luminosity 1105
	Teff       15000
	FeH        0

	BinaryOrbit
	{
		Separation      418
	}
}

Star "HD 40967 B"
{
	ParentBody "HD 40967"
	Class      "B7.3 V"

	/* BinaryOrbit
	{
		Separation      418
	} */
}

// 参宿增卅二(SB**)
Star	"HD 40536 A"
{
	ParentBody     "HD 40536"
	Class          "A3III"

	Orbit
	{
		RefPlane        "Equator"
		Period          34.5901959
		Eccentricity    0.27560997
		Inclination     0.761355639
		AscendingNode   0
		ArgOfPericenter -21.9076897
		MeanAnomaly     38.5951626
	}
}

Star	"HD 40536 B"
{
	ParentBody     "HD 40536"
	Class          "F5.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          34.5901959
		Eccentricity    0.27560997
		Inclination     0.761355639
		AscendingNode   0
		ArgOfPericenter 158.09231
		MeanAnomaly     38.5951626
	}
}

// 参宿增卅九(SB**)
Star	"HD 35007 A"
{
	ParentBody     "HD 35007"
	Class          "B5II"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.531721514
		Eccentricity    0.363972962
		Inclination     2.2246877
		AscendingNode   0
		ArgOfPericenter -29.8604026
		MeanAnomaly     103.682051
	}
}

Star	"HD 35007 B"
{
	ParentBody     "HD 35007"
	Class          "A1.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.531721514
		Eccentricity    0.363972962
		Inclination     2.2246877
		AscendingNode   0
		ArgOfPericenter 150.139597
		MeanAnomaly     103.682051
	}
}

// 玉井增一(a2**)
Star	"HD 32964 A"
{
	ParentBody     "HD 32964"
	Class          "B9V"
	MassSol        2.629
	RadSol         1.948
	Luminosity     51.3
	Teff           11077
	Age            0.03

	Orbit
	{
		PeriodDays      5.5226013
		Eccentricity    0.0844
		Epoch           2441356.499
		ArgOfPericenter 340.9
		MeanAnomaly     0
		//SemiAmplitude   102.83
	}
}

Star	"HD 32964 B"
{
	ParentBody     "HD 32964"
	Class          ""
	MassSol        2.566
	RadSol         1.919
	Luminosity     46.9
	Teff           10914

	Orbit
	{
		PeriodDays      5.5226013
		Eccentricity    0.0844
		Epoch           2441356.499
		ArgOfPericenter 160.9
		MeanAnomaly     0
		//SemiAmplitude   100.35
	}
}

// 军井增一(SB**)
Star	"HD 35337 A"
{
	ParentBody     "HD 35337"
	Class          "B2IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          8.02294639
		Eccentricity    0.226967856
		Inclination     1.08955967
		AscendingNode   0
		ArgOfPericenter -143.072173
		MeanAnomaly     26.390527
	}
}

Star	"HD 35337 B"
{
	ParentBody     "HD 35337"
	Class          "B7.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          8.02294639
		Eccentricity    0.226967856
		Inclination     1.08955967
		AscendingNode   0
		ArgOfPericenter 36.9278268
		MeanAnomaly     26.390527
	}
}

// 厕增四(Sy**)
Remove "17 Lep A"{ParentBody "17 Lep"}
Remove "17 Lep B"{ParentBody "17 Lep"}
Star	"HD 41511 A"
{
	ParentBody     "HD 41511"
	Class          "A1V"
	MassSol        2.71
	RadSol         18
	Luminosity     1900
	Teff           9000

	Orbit
	{
		PeriodDays      260.34
		Eccentricity    0.005
		Inclination     143.7
		AscendingNode   162.2
		Epoch           2448528.78
		ArgOfPericenter 23.7
		MeanAnomaly     0
		//SemiAmplitude   6.1
	}
}

Star	"HD 41511 B"
{
	ParentBody     "HD 41511"
	Class          "M6III"
	MassSol        1.3
	RadSol         66.7
	Luminosity     1200
	Teff           3250

	Orbit
	{
		PeriodDays      260.34
		Eccentricity    0.005
		Inclination     143.7
		AscendingNode   162.2
		Epoch           2448528.78
		ArgOfPericenter 203.7
		MeanAnomaly     0
		//SemiAmplitude   21.32
	}
}
