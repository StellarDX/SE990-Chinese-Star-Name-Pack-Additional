// 候增五(**)
Barycenter	"HD 159480 A/BD+09 3424/GC 23824/SAO 122526"
{
	ParentBody     "HD 159480"
	BinaryOrbit
	{
		Epoch           2455562.19758469
		Separation      4705.92
		PositionAngle   190
	}
}

Star	"HD 159480 Aa"
{
	ParentBody     "HD 159480 A"
	Class          "A2V"
	MassSol        2.5
	RadSol         1.7
	Luminosity     56.4
	Teff           9311
  FeH            0.21

	BinaryOrbit
	{
		Separation      42.089
	}
}

Star	"HD 159480 Ab"
{
	ParentBody     "HD 159480 A"
	Class          "F9 V"

	BinaryOrbit
	{
		Separation      42.089
	}
}

Star	"HD 159480 B/BD+09 3423/GC 23823/SAO 122525"
{
	ParentBody     "HD 159480"
	Class          "A8IV"
	RadSol         1.72
  Luminosity     7.74
  Teff           7344

	BinaryOrbit
	{
		Epoch           2455562.19758469
		Separation      4705.92
		PositionAngle   190
	}
}

// 宦者增一(**)
Star	"HD 152879 A"
{
	ParentBody     "HD 152879"
	Class          "K4III"

	BinaryOrbit
	{
		Separation      275.176
	}
}

Star	"HD 152879 B"
{
	ParentBody     "HD 152879"
	Class          "F1.6 V"

	BinaryOrbit
	{
		Separation      275.176
	}
}

// 斗增九(SB**)
Star	"HD 147869 A"
{
	ParentBody     "HD 147869"
	Class          "A1 III"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0342785824
		Eccentricity    0.107141733
		Inclination     -1.02655458
		AscendingNode   0
		ArgOfPericenter -169.54165
		MeanAnomaly     27.2837389
	}
}

Star	"HD 147869 B"
{
	ParentBody     "HD 147869"
	Class          "F6.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0342785824
		Eccentricity    0.107141733
		Inclination     -1.02655458
		AscendingNode   0
		ArgOfPericenter 10.4583503
		MeanAnomaly     27.2837389
	}
}

// 斗增十(*Pl)
Remove "11 Oph b"{ParentBody "11 Oph"}
Planet	"HD 149121 b"
{
	ParentBody     "HD 149121"
	DiscMethod     "Imaging"
	DiscDate       "2007"
	Mass           6674.39598

	Orbit
	{
		SemiMajorAxis   243
		PeriodDays      730000
	}
}

// 斛增六(**)
Star	"HD 150378 A"
{
	ParentBody     "HD 150378"
	Class          "B9V"

	Orbit
	{
		RefPlane        "Equator"
		Period          8933.11726
		Eccentricity    0.756598711
		Inclination     -1.85094118
		AscendingNode   0
		ArgOfPericenter 34.6876981
		MeanAnomaly     152.279088
	}
}

Star	"HD 150378 B"
{
	ParentBody     "HD 150378"
	Class          "F7.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          8933.11726
		Eccentricity    0.756598711
		Inclination     -1.85094118
		AscendingNode   0
		ArgOfPericenter 214.687698
		MeanAnomaly     152.279088
	}
}

// 列肆增一(**)
Star	"HD 152127 A"
{
	ParentBody     "HD 152127"
	Class          "A0 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1.09551164
		Eccentricity    0.468553007
		Inclination     -0.429555893
		AscendingNode   0
		ArgOfPericenter -125.149769
		MeanAnomaly     94.147165
	}
}

Star	"HD 152127 B"
{
	ParentBody     "HD 152127"
	Class          "G2.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1.09551164
		Eccentricity    0.468553007
		Inclination     -0.429555893
		AscendingNode   0
		ArgOfPericenter 54.8502313
		MeanAnomaly     94.147165
	}
}

// 宗正增三(**)
Star	"HD 156266 A"
{
	ParentBody     "HD 156266"
	Class          "K2III"
	MassSol        1.46
	RadSol         11.8
	Luminosity     60.3
	Teff           4509
	FeH            0.06
	Age            3.73

	Orbit
	{
		Period          140.76
		Eccentricity    0.866
		Inclination     65.1
		AscendingNode   220.5
		Epoch           2411561.46989754
		ArgOfPericenter 107.5
		MeanAnomaly     0
	}
}

Star	"HD 156266 B"
{
	ParentBody     "HD 156266"
	Class          "G1.7 V"

	Orbit
	{
		Period          140.76
		Eccentricity    0.866
		Inclination     65.1
		AscendingNode   220.5
		Epoch           2411561.46989754
		ArgOfPericenter 287.5
		MeanAnomaly     0
	}
}

// 宗人增一(PM**)
// C已确认为光学伴星
Remove "72 Oph A"{ParentBody "72 Oph"}
Remove "72 Oph B"{ParentBody "72 Oph"}
Star "HD 165777 A"
{
	ParentBody "HD 165777"
	Class      "A5V"
	MassSol    1.99
	RadSol     1.9
	Luminosity 20
	Teff       8718
	FeH        0.09
	Age        0.25

	BinaryOrbit
	{
		Separation      665 // 25"
	}
}

Star "HD 165777 B"
{
	ParentBody "HD 165777"
	Class      "F3.8 V"

	BinaryOrbit
	{
		Separation      665 // 25"
	}
}

// 宗人增三(gD**?)
Star "HD 166233 A"
{
	ParentBody "HD 166233"
	Class      "F3V"
	RadSol     2.56
	Luminosity 12.98
	Teff       6918

	BinaryOrbit
	{
		Separation      19.878
	}
}

Star "HD 166233 B"
{
	ParentBody "HD 166233"
	Class      "F8.6 V"

	BinaryOrbit
	{
		Separation      19.878
	}
}

// 宗人增四(**?)
Star	"HD 168656 A"
{
	ParentBody     "HD 168656"
	Class          "G8III"
	MassSol        2.38
	RadSol         10.52
	Luminosity     66
	Teff           5073
	FeH            -0.21
	Age            1.73

	Orbit
	{
		RefPlane        "Equator"
		Period          0.192617439
		Eccentricity    0
		Inclination     0.462908745
		AscendingNode   0
		ArgOfPericenter -1.03526453
		MeanAnomaly     170.629167
	}
}

Star	"HD 168656 B"
{
	ParentBody     "HD 168656"
	Class          "F1.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.192617439
		Eccentricity    0
		Inclination     0.462908745
		AscendingNode   0
		ArgOfPericenter 178.964735
		MeanAnomaly     170.629167
	}
}

// 帛度增一(SB**)
Star	"HD 164852 A"
{
	ParentBody     "HD 164852"
	Class          "B3 IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.322864113
		Eccentricity    0.0491263121
		Inclination     0.997183442
		AscendingNode   0
		ArgOfPericenter 119.356725
		MeanAnomaly     -124.60158
	}
}

Star	"HD 164852 B"
{
	ParentBody     "HD 164852"
	Class          "B7.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.322864113
		Eccentricity    0.0491263121
		Inclination     0.997183442
		AscendingNode   0
		ArgOfPericenter 299.356725
		MeanAnomaly     -124.60158
	}
}

// 帛度增三(**?)
Star	"HD 164349 A"
{
	ParentBody     "HD 164349"
	Class          "K0.5IIb"
	RadSol         50.53
	Luminosity     919
	Teff           4471
	FeH            -0.22

	Orbit
	{
		RefPlane        "Equator"
		Period          0.152612527
		Eccentricity    0
		Inclination     1.27461338
		AscendingNode   0
		ArgOfPericenter 153.304996
		MeanAnomaly     -157.053196
	}
}

Star	"HD 164349 B"
{
	ParentBody     "HD 164349"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.152612527
		Eccentricity    0
		Inclination     1.27461338
		AscendingNode   0
		ArgOfPericenter 333.304996
		MeanAnomaly     -157.053196
	}
}

// 屠肆增二(SB**)
Remove "105 Her A"{ParentBody "105 Her"}
Remove "105 Her B"{ParentBody "105 Her"}
Star "HD 168532 1"
{
	ParentBody "HD 168532"
	Class      "K3III:Ba0.5"

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

Star "HD 168532 2"
{
	ParentBody "HD 168532"
	Class      "A2.2 V"

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

// 屠肆增三(PM**?)
Star	"HD 168720 A"
{
	ParentBody     "HD 168720"
	Class          "M0III"
	RadSol         44.32
	Luminosity     414.1
	Teff           3789
	FeH            0

	Orbit
	{
		RefPlane        "Equator"
		Period          13.6034335
		Eccentricity    0.190907493
		Inclination     -0.67169857
		AscendingNode   0
		ArgOfPericenter 56.9844478
		MeanAnomaly     26.0342212
	}
}

Star	"HD 168720 B"
{
	ParentBody     "HD 168720"
	Class          "M0III"

	Orbit
	{
		RefPlane        "Equator"
		Period          13.6034335
		Eccentricity    0.190907493
		Inclination     -0.67169857
		AscendingNode   0
		ArgOfPericenter 236.984448
		MeanAnomaly     26.0342212
	}
}

// 晋增一(SB**)
Star	"HD 143666 A"
{
	ParentBody     "HD 143666"
	Class          "G8III"

	Orbit
	{
		RefPlane        "Equator"
		Period          568.141722
		Eccentricity    0.263813943
		Inclination     -1.26853013
		AscendingNode   0
		ArgOfPericenter 39.1235086
		MeanAnomaly     75.7413641
	}
}

Star	"HD 143666 B"
{
	ParentBody     "HD 143666"
	Class          "A5.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          568.141722
		Eccentricity    0.263813943
		Inclination     -1.26853013
		AscendingNode   0
		ArgOfPericenter 219.123509
		MeanAnomaly     75.7413641
	}
}

// 周增六(**)
Remove "TAU7 Ser A"{ParentBody "TAU7 Ser"}
Remove "TAU7 Ser B"{ParentBody "TAU7 Ser"}
Star "HD 140232 A"
{
	ParentBody "HD 140232"
	Class      "A2m"
	MassSol    1.7
	RadSol     1.82
	Luminosity 10.2
	Teff       7809
	FeH        0.52
	Age        0.7

	BinaryOrbit
	{
		Separation      121.9
	}
}

Star "HD 140232 B"
{
	ParentBody "HD 140232"
	Class      "M"
	MassSol    0.58

	BinaryOrbit
	{
		Separation      121.9
	}
}

// 周增七(**)
Barycenter	"HD 140159 AB"
{
	ParentBody     "HD 140159"
	BinaryOrbit
	{
		Separation      8294
	}
}

Star "HD 140159 A"
{
	ParentBody "HD 140159 AB"
	Class      "B9V"
	MassSol    1.999

	Orbit
	{
		PeriodDays      8015
		Eccentricity    0.0941
		Inclination     83.608
		AscendingNode   69.684
		Epoch           2454180.5
		ArgOfPericenter 260.5
		MeanAnomaly     0
	}
}

Star "HD 140159 B"
{
	ParentBody "HD 140159 AB"
	Class      "A1V"
	MassSol    1.984

	Orbit
	{
		PeriodDays      8015
		Eccentricity    0.0941
		Inclination     83.608
		AscendingNode   69.684
		Epoch           2454180.5
		ArgOfPericenter 80.5
		MeanAnomaly     0
	}
}

Star "HD 140159 C"
{
	ParentBody "HD 140159"
	Class      "F8.2 V"

	BinaryOrbit
	{
		Separation      8294
	}
}

// 周增十二(PM**?)
Star	"HD 141187 A"
{
	ParentBody     "HD 141187"
	Class          "A3V"
	MassSol        2.9
	RadSol         2.2
	Luminosity     23
	Teff           8917
	Age            0.403

	Orbit
	{
		RefPlane        "Equator"
		Period          3158.7749
		Eccentricity    0.820376992
		Inclination     1.86730951
		AscendingNode   0
		ArgOfPericenter 89.3320621
		MeanAnomaly     149.18267
	}
}

Star	"HD 141187 B(?)"
{
	ParentBody     "HD 141187"
	Class          "X" // Unknown object/maybe a black hole
	LumBol         6.4733542319749216300940438871473e-5 // X-Ray

	Orbit
	{
		RefPlane        "Equator"
		Period          3158.7749
		Eccentricity    0.820376992
		Inclination     1.86730951
		AscendingNode   0
		ArgOfPericenter 269.332062
		MeanAnomaly     149.18267
	}
}

// 周增十三(**)
Remove "39 Ser A"{ParentBody "39 Ser"}
Remove "39 Ser B"{ParentBody "39 Ser"}
Star "HD 142267 A"
{
	ParentBody "HD 142267"
	Class      "G0 V"
	MassSol    0.88

	Orbit
	{
		Period          0.3797
		Eccentricity    0.5
		Inclination     84.8
		AscendingNode   41.6
		ArgOfPericenter 286.4
		Epoch           2444165.4
		MeanAnomaly     0
	}
}

Star "HD 142267 B"
{
	ParentBody "HD 142267"
	Class      "M" //invisible low mas star/could be also a WD

	Orbit
	{
		Period          0.3797
		Eccentricity    0.5
		Inclination     84.8
		AscendingNode   41.6
		ArgOfPericenter 106.4
		Epoch           2444165.4
		MeanAnomaly     0
	}
}

// 秦增二(SB**)
Star "HD 139195 A"
{
	ParentBody "HD 139195"
	Class      "K0III: CN1 Ba0.7 Sr2"
	MassSol    1.7
	RadSol     8
	Luminosity 42.7
	Teff       4946
	FeH        -0.13
	Age        2.4

	Orbit
	{
		PeriodDays      5324
		Eccentricity    0.345
		Epoch           2444090.5
		ArgOfPericenter 178
		MeanAnomaly     0
		//SemiAmplitude   3.86
	}
}

Star "HD 139195 B"
{
	ParentBody "HD 139195"
	Class      "WD"

	Orbit
	{
		PeriodDays      5324
		Eccentricity    0.345
		Epoch           2444090.5
		ArgOfPericenter 358
		MeanAnomaly     0
	}
}

// 蜀增一(*Pl)
Remove "HD 141004 b"{ParentBody "HD 141004"}
Planet	"HD 141004 b"
{
	ParentBody     "LAM Ser"
	DiscDate       "2020"
	Class          "IceGiant" // most likely be a hot Neptune
	Mass           13.6

	Orbit
	{
		SemiMajorAxis   0.1238
		PeriodDays      15.5083
		Eccentricity    0.16
	}
}

// 蜀增二(**)
Star "HD 135482 A"
{
	ParentBody "HD 135482"
	Class      "K0III"
	Teff       4550
	FeH        0.03

	Orbit
	{
		Period          66
		Eccentricity    0.962
		Inclination     132
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 135482 B"
{
	ParentBody "HD 135482"
	Class      "K"

	Orbit
	{
		Period          66
		Eccentricity    0.962
		Inclination     132
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 巴增一(PM***)
Remove "PSI Ser A"{ParentBody "PSI Ser"}
Remove "PSI Ser B"{ParentBody "PSI Ser"}
Star "HD 140538 A"
{
	ParentBody "HD 140538"
	Class      "G5V"
	MassSol    0.993
	RadSol     1
	Luminosity 0.98
	Teff       5683
	FeH        0.036
	Age        3.2

	Orbit
	{
		Period          900
		SemiMajorAxis   35.44541192
		Eccentricity    0.435
		Inclination     138.1
		AscendingNode   54.9
		Epoch           2428205.55689599
		ArgOfPericenter 150.9
		MeanAnomaly     0
	}
}

Barycenter	"HD 140538 B"
{
	ParentBody     "HD 140538"
	Orbit
	{
		Period          900
		SemiMajorAxis   70.39458808
		Eccentricity    0.435
		Inclination     138.1
		AscendingNode   54.9
		Epoch           2428205.55689599
		ArgOfPericenter 330.9
		MeanAnomaly     0
	}
}

Star "HD 140538 Ba"
{
	ParentBody "HD 140538 B"
	Class      "M3"
	MassSol    0.26

	Orbit
	{
		Period          6.57
		Eccentricity    0.357
		Inclination     70.4
		AscendingNode   21.4
		Epoch           2458882.24917161
		ArgOfPericenter 50
		MeanAnomaly     0
	}
}

Star "HD 140538 Bb"
{
	ParentBody "HD 140538 B"
	Class      "M3"
	MassSol    0.24

	Orbit
	{
		Period          6.57
		Eccentricity    0.357
		Inclination     70.4
		AscendingNode   21.4
		Epoch           2458882.24917161
		ArgOfPericenter 230
		MeanAnomaly     0
	}
}

// 巴增二(*Pl)
Remove "OME Ser b"{ParentBody "OME Ser"}
Planet	"HD 141680 b"
{
	ParentBody     "HD 141680"
	DiscMethod     "RadVel"
	DiscDate       "2013"
	Mass           540.308246

	Orbit
	{
		SemiMajorAxis   1.1
		PeriodDays      277.02
		Eccentricity    0.106
	}
}

// 巴增五(**)
Star "HD 141851 A"
{
	ParentBody "HD 141851"
	Class      "A7"
	MassSol    2.04
	RadSol     1.65
	Luminosity 19.13
	Teff       8246
	FeH        -2
	Age        0.723

	Orbit
	{
		Period          50.6
		Eccentricity    0.8323
		Inclination     98.08
		AscendingNode   74
		Epoch           2452559.90671071
		ArgOfPericenter 252.84
		MeanAnomaly     0
	}
}

Star "HD 141851 B"
{
	ParentBody "HD 141851"
	Class      "G0"

	Orbit
	{
		Period          50.6
		Eccentricity    0.8323
		Inclination     98.08
		AscendingNode   74
		Epoch           2452559.90671071
		ArgOfPericenter 72.84
		MeanAnomaly     0
	}
}

// 中山增二(LP**)
Star "HD 164136 A"
{
	ParentBody "HD 164136"
	Class      "A9hF2mF2(IV)"
	MassSol    5.31
	Luminosity 799
	Teff       6410
	FeH        -0.33
	Age        0.2
	Oblateness 0

	BinaryOrbit
	{
		Separation      115.96
	}
}

Star "HD 164136 B"
{
	ParentBody "HD 164136"
	Class      "B9.5"

	BinaryOrbit
	{
		Separation      115.96
	}
}

// 中山增三(SB**)
Star "HD 165908 A"
{
	ParentBody "HD 165908"
	Class      "F7V"
	MassSol    0.94
	RadSol     1.1
	Luminosity 1.96
	Teff       5938
	FeH        -0.6
	Age        9.37

	Orbit
	{
		Period          56.3
		Eccentricity    0.766
		Inclination     39
		AscendingNode   41
		Epoch           2450675.25696500
		ArgOfPericenter 296
		MeanAnomaly     0
	}
}

Star "HD 165908 B"
{
	ParentBody "HD 165908"
	Class      "K4V"
	MassSol    0.46
	RadSol     0.74
	Luminosity 0.14

	Orbit
	{
		Period          56.3
		Eccentricity    0.766
		Inclination     39
		AscendingNode   41
		Epoch           2450675.25696500
		ArgOfPericenter 116
		MeanAnomaly     0
	}
}

// 中山增五(SB**)
Star	"HD 168913 A"
{
	ParentBody     "HD 168913"
	Class          "A3mA7"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.247637232
		Eccentricity    0.86145556
		Inclination     -0.421214342
		AscendingNode   0
		ArgOfPericenter -76.2268047
		MeanAnomaly     81.6298937
	}
}

Star	"HD 168913 B"
{
	ParentBody     "HD 168913"
	Class          "A9V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.247637232
		Eccentricity    0.86145556
		Inclination     -0.421214342
		AscendingNode   0
		ArgOfPericenter 103.773195
		MeanAnomaly     81.6298937
	}
}

// 中山增七(**)
Star "SAO 85753/HD 166045/HR 6781"
{
	ParentBody "HIP 88817"
	Class      "A3V"

	BinaryOrbit
	{
		Separation      991.9
	}
}

Star "中山增七/SAO 85752/HD 166046/HR 6782"
{
	ParentBody "HIP 88817"
	Class      "A3V"

	BinaryOrbit
	{
		Separation      991.9
	}
}

// 齐增一(SB**)
Star	"HD 175492 A"
{
	ParentBody     "113 Her"
	Class          "G8III"
	RadSol         19.16
	Luminosity     313.91
	Teff           5337

	Orbit
	{
		RefPlane        "Equator"
		Period          7538.40142
		Eccentricity    0.597887099
		Inclination     0.343488455
		AscendingNode   0
		ArgOfPericenter 157.161571
		MeanAnomaly     144.594159
	}
}

Star	"HD 175492 B"
{
	ParentBody     "113 Her"
	Class          "A0.5"

	Orbit
	{
		RefPlane        "Equator"
		Period          7538.40142
		Eccentricity    0.597887099
		Inclination     0.343488455
		AscendingNode   0
		ArgOfPericenter 337.161571
		MeanAnomaly     144.594159
	}
}

// 齐增三(SB**)
Remove "1 Vul (AB)"{ParentBody "1 Vul"}
Remove "1 Vul C"{ParentBody "1 Vul"}
Remove "1 Vul A"{ParentBody "1 Vul (AB)"}
Remove "1 Vul B"{ParentBody "1 Vul (AB)"}
Barycenter "HD 180554 A"
{
	ParentBody "HD 180554"
	Orbit
	{
		Period          400000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 180554 Aa"
{
	ParentBody "HD 180554 A"
	Class      "B4IV"
	MassSol    6.9
	Luminosity 919
	Teff       16787
	FeH        0

	Orbit
	{
		PeriodDays      250
		Eccentricity    0.63
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 180554 Ab"
{
	ParentBody "HD 180554 A"
	Class      ""
	MassSol    1.12

	Orbit
	{
		PeriodDays      250
		Eccentricity    0.63
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 180554 B"
{
	ParentBody "HD 180554"
	Class      ""
	MassSol    0.8
	Orbit
	{
		Period          400000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 齐增四(Pu**)
Star "HD 180968 A"
{
	ParentBody "HD 180968"
	Class      "B1IV"
	MassSol    12.5
	LumBol     21922
	Teff       26850
	Age        0.0126

	Orbit
	{
		Epoch           2452275.01779566
		Separation      980.4
		PositionAngle   127.2
	}
}

Star "HD 180968 B"
{
	ParentBody "HD 180968"
	Class      "F2 V"

	Orbit
	{
		Epoch           2452275.01779566
		Separation      980.4
		PositionAngle   127.2
	}
}

// 齐增七(**)
Star	"HD 182807 A"
{
	ParentBody     "HD 182807"
	Class          "F8"

	Orbit
	{
		RefPlane        "Equator"
		Period          8417.16985
		Eccentricity    0.840576291
		Inclination     -1.89423847
		AscendingNode   0
		ArgOfPericenter 110.992499
		MeanAnomaly     7.19904237
	}
}

Star	"HD 182807 B"
{
	ParentBody     "HD 182807"
	Class          "T0.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          8417.16985
		Eccentricity    0.840576291
		Inclination     -1.89423847
		AscendingNode   0
		ArgOfPericenter 290.992499
		MeanAnomaly     7.19904237
	}
}

// 齐增八(Pu**)
Remove "3 Vul A"{ParentBody "3 Vul"}
Remove "3 Vul B"{ParentBody "3 Vul"}
Star "HD 182255 A"
{
	ParentBody "HD 182255"
	Class      "B6III"
	MassSol    4.16
	Luminosity 286
	Teff       14343

	Orbit
	{
		PeriodDays      367.7
		Eccentricity    0.15
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   6.8
	}
}

Star "HD 182255 B"
{
	ParentBody "HD 182255"
	Class      ""
	MassSol    0.6

	Orbit
	{
		PeriodDays      367.7
		Eccentricity    0.15
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 齐增九(**)
Star	"HD 178476 A"
{
	ParentBody     "HD 178476"
	Class          "F3V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0345192101
		Eccentricity    0.0118759684
		Inclination     -0.401299953
		AscendingNode   0
		ArgOfPericenter -101.837049
		MeanAnomaly     -18.6292106
	}
}

Star	"HD 178476 B"
{
	ParentBody     "HD 178476"
	Class          "K1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0345192101
		Eccentricity    0.0118759684
		Inclination     -0.401299953
		AscendingNode   0
		ArgOfPericenter 78.1629512
		MeanAnomaly     -18.6292106
	}
}

// 吴越增一(SB**)
Remove "EPS Aql A"{ParentBody "EPS Aql"}
Remove "EPS Aql B"{ParentBody "EPS Aql"}
Star "HD 176411 A"
{
	ParentBody "HD 176411"
	Class      "K1III"
	MassSol    2.1
	RadSol     10.14
	Luminosity 54
	Teff       4760
	FeH        0

	Orbit
	{
		PeriodDays      1270.6
		Eccentricity    0.272
		Inclination     87.5
		AscendingNode   58.7
		Epoch           2441718.5
		ArgOfPericenter 262
		MeanAnomaly     0
		//SemiAmplitude   5.17
	}
}

Star "HD 176411 B"
{
	ParentBody "HD 176411"
	Class      "WD"
	MassSol    0.47

	Orbit
	{
		PeriodDays      1270.6
		Eccentricity    0.272
		Inclination     87.5
		AscendingNode   58.7
		Epoch           2441718.5
		ArgOfPericenter 82
		MeanAnomaly     0
	}
}

// 吴越增四(EB***)
Barycenter "HD 178125 A"
{
	ParentBody "HD 178125"
	BinaryOrbit
	{
		Separation      49.6009
	}
}

Star "HD 178125 Aa"
{
	ParentBody "HD 178125 A"
	Class      "B8III"

	Orbit
	{
		PeriodDays      1.302
		Inclination     90 // ?
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 178125 Ab"
{
	ParentBody "HD 178125 A"
	Class      "A2.3 V"

	Orbit
	{
		PeriodDays      1.302
		Inclination     90 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 178125 B"
{
	ParentBody "HD 178125"
	Class      "F2.4 V"

	/*BinaryOrbit
	{
		Separation      49.6009
	}*/
}

// 徐增二(SB**)
Star "HD 175515 A"
{
	ParentBody "HD 175515"
	Class      "G9III"
	MassSol    1.54
	RadSol     10.69
	Luminosity 52.8
	Teff       4666
	FeH        -0.26
	RotationPeriod 0 // projected rotational velocity is too small to measure
	Age        3.21

	Orbit
	{
		PeriodDays      2994
		Eccentricity    0.243
		Inclination     31.9
		AscendingNode   12.6
		Epoch           2444276.5
		ArgOfPericenter 215
		MeanAnomaly     0
		//SemiAmplitude   4.65
	}
}

Star "HD 175515 B"
{
	ParentBody "HD 175515"
	Class      "F6.6 V"

	Orbit
	{
		PeriodDays      2994
		Eccentricity    0.243
		Inclination     31.9
		AscendingNode   12.6
		Epoch           2444276.5
		ArgOfPericenter 35
		MeanAnomaly     0
	}
}

// 东海增二(***)
Barycenter	"HD 169985 A"
{
	ParentBody     "HD 169985"
	Orbit
	{
		RefPlane        "Equator"
		Period          15.6149297
		SemiMajorAxis   2.82820856
		Eccentricity    0.480264485
		Inclination     2.25846373
		AscendingNode   0
		ArgOfPericenter 175.356052
		MeanAnomaly     48.1740138
	}
}

Star	"HD 169985 Aa"
{
	ParentBody     "HD 169985 A"
	Class          "A0Vs"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0343787723
		Eccentricity    0
		Inclination     1.59181565
		AscendingNode   0
		ArgOfPericenter -175.77714
		MeanAnomaly     -92.4598313
	}
}

Star	"HD 169985 Ab"
{
	ParentBody     "HD 169985 A"
	Class          "G III"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0343787723
		Eccentricity    0
		Inclination     1.59181565
		AscendingNode   0
		ArgOfPericenter 4.22285981
		MeanAnomaly     -92.4598313
	}
}

Star	"HD 169985 B"
{
	ParentBody     "HD 169985"
	Class          "K III"

	Orbit
	{
		RefPlane        "Equator"
		Period          15.6149297
		SemiMajorAxis   5.15763823
		Eccentricity    0.480264485
		Inclination     2.25846373
		AscendingNode   0
		ArgOfPericenter 355.356052
		MeanAnomaly     48.1740138
	}
}

// 天纪增二(**)
Star	"HD 148283 A"
{
	ParentBody     "HD 148283"
	Class          "A5V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00656387705
		Eccentricity    0
		Inclination     -2.32561016
		AscendingNode   0
		ArgOfPericenter 55.6089733
		MeanAnomaly     -98.1296342
	}
}

Star	"HD 148283 B"
{
	ParentBody     "HD 148283"
	Class          "F0.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00656387705
		Eccentricity    0
		Inclination     -2.32561016
		AscendingNode   0
		ArgOfPericenter 235.608973
		MeanAnomaly     -98.1296342
	}
}

// 天纪增六(SB**)
Star	"HD 149420 A"
{
	ParentBody     "HD 149420"
	Class          "A8III"

	Orbit
	{
		RefPlane        "Equator"
		Period          464.156406
		Eccentricity    0.337150127
		Inclination     -1.46053076
		AscendingNode   0
		ArgOfPericenter -52.4296321
		MeanAnomaly     80.8324913
	}
}

Star	"HD 149420 B"
{
	ParentBody     "HD 149420"
	Class          "G7.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          464.156406
		Eccentricity    0.337150127
		Inclination     -1.46053076
		AscendingNode   0
		ArgOfPericenter 127.570368
		MeanAnomaly     80.8324913
	}
}

// 天纪增七(SB**)
Star	"HD 150682 A"
{
	ParentBody     "HD 150682"
	Class          "F3V"

	Orbit
	{
		RefPlane        "Equator"
		Period          5.41161872
		Eccentricity    0.686172903
		Inclination     -0.638306141
		AscendingNode   0
		ArgOfPericenter 82.7431013
		MeanAnomaly     -72.9801729
	}
}

Star	"HD 150682 B"
{
	ParentBody     "HD 150682"
	Class          "F3V"

	Orbit
	{
		RefPlane        "Equator"
		Period          5.41161872
		Eccentricity    0.686172903
		Inclination     -0.638306141
		AscendingNode   0
		ArgOfPericenter 262.743101
		MeanAnomaly     -72.9801729
	}
}

// 天纪增八(**)
Star	"HD 151237 A"
{
	ParentBody     "HD 151237"
	Class          "F8II"

	BinaryOrbit
	{
		Separation      38573.89490055
	}
}

Star	"HD 151237 B"
{
	ParentBody     "HD 151237"
	Class          "F9.4 V"

	BinaryOrbit
	{
		Separation      38573.89490055
	}
}

// 贯索增二(*Pl)
Remove "OMI CrB b"{ParentBody "OMI CrB"}
Planet	"HD 136512 b"
{
	ParentBody     "HD 136512"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	Mass           476.74257

	Orbit
	{
		SemiMajorAxis   0.83
		PeriodDays      187.83
		Eccentricity    0.191
	}
}

// 贯索增三(SB***)
Remove "ETA CrB (AB)"{ParentBody "ETA CrB"}
Remove "ETA CrB C"{ParentBody "ETA CrB"}
Remove "ETA CrB A"{ParentBody "ETA CrB (AB)"}
Remove "ETA CrB B"{ParentBody "ETA CrB (AB)"}
Star "HIP 75312 A/HD 137107 A"
{
	ParentBody "HIP 75312"
	Class 	   "G1V"
	MassSol    1.19
	FeH        -0.2
	Age        1

	Orbit
	{
		PeriodDays      15189.1
		Eccentricity    0.277
		Inclination     58.7
		AscendingNode   22.9
		Epoch           2412214.15770677
		ArgOfPericenter 219.24
		MeanAnomaly     0
		//SemiAmplitude   4.709
	}
}

Star "HIP 75312 B/HD 137108 B"
{
	ParentBody "HIP 75312"
	Class      "G3V"
	MassSol    1.05

	Orbit
	{
		PeriodDays      15189.1
		Eccentricity    0.277
		Inclination     58.7
		AscendingNode   22.9
		Epoch           2412214.15770677
		ArgOfPericenter 39.24
		MeanAnomaly     0
		//SemiAmplitude   5.276
	}
}

Star "HIP 75312 C/2MASSW J1523226+301456"
{
	ParentBody "HIP 75312"
	DiscDate   "2001"
	Class      "L8"
	Mass       20023.18794

	Orbit
	{
		SemiMajorAxis   3600
	}
}

// 贯索增四(*Pl)
Remove "KAP CrB b"{ParentBody "KAP CrB"}
Planet	"HD 142091 b"
{
	ParentBody     "HD 142091"
	DiscMethod     "Astrometry" // Doppler spectroscopy
	DiscDate       "2007" // Johnson et al./Lick Observatory/2007
	Mass           575.58719618

	Orbit
	{
		SemiMajorAxis   2.65
		Eccentricity    0.167
		PeriodDays      1285
		Epoch           2456830
		ArgOfPericenter 194
	}
}

// 贯索增六(PM**?)
Remove "TAU CrB A"{ParentBody "TAU CrB"}
Remove "TAU CrB B"{ParentBody "TAU CrB"}
Star "HD 145328 A"
{
	ParentBody "HD 145328"
	Class 	   "K1III"
	RadSol     6
	Luminosity 16.2
	Teff       4742
  FeH        -0.2

	Orbit
	{
		Epoch           2456657.92418103
		Separation      79.2
		PositionAngle   186
	}
}

Star "HD 145328 B(?)"
{
	ParentBody "HD 145328"
	Class      "K3.7 V"

	Orbit
	{
		Epoch           2456657.92418103
		Separation      79.2
		PositionAngle   186
	}
}

// 贯索增七(RS*****)
Remove "SIG CrB A"{ParentBody "SIG CrB"}
Remove "SIG CrB B"{ParentBody "SIG CrB"}
Remove "SIG CrB Aa"{ParentBody "SIG CrB A"}
Remove "SIG CrB Ab"{ParentBody "SIG CrB A"}

// ---------------------------------------- //

Barycenter "贯索增七/SIG CrB AB/HIP 79607 AB"
{
	ParentBody "SIG CrB"
	BinaryOrbit
	{
		Separation      14000
	}
}

Barycenter "SIG CrB C/GJ 9549/HIP 79551 C/WDS J16147+3352E/G 180-42"
{
	ParentBody "SIG CrB"
	BinaryOrbit
	{
		Separation      14000
	}
}

// ---------------------------------------- //

Barycenter "SIG CrB A/SIG2 CrB/TZ CrB/GJ 9550B/HD 146361/HR 6064/CCDM J16147+3352A/WDS J16147+3352A/TYC 2583-1846-1"
{
	ParentBody "SIG CrB AB"
	Orbit
	{
		Period          726
		Eccentricity    0.72
		Inclination     32.3
		AscendingNode   28
		Epoch           2387700.19705118
		ArgOfPericenter 237.3
		MeanAnomaly     0
	}
}

Star "SIG CrB B/SIG1 CrB/GJ 9550A/HD 146362/HR 6063/CCDM J16147+3352B/WDS J16147+3352B/TYC 2583-1846-2"
{
	ParentBody "SIG CrB AB"
	Class      "G1V"
	MassSol    1
	Teff       5950
	Age        1

	Orbit
	{
		Period          726
		Eccentricity    0.72
		Inclination     32.3
		AscendingNode   28
		Epoch           2387700.19705118
		ArgOfPericenter 57.3
		MeanAnomaly     0
	}
}

// ---------------------------------------- //

Star "SIG2 CrB Aa"
{
	ParentBody "SIG CrB A"
	Class      "F6V"
	MassSol    1.137
	RadSol     1.244
	Teff       6050
	FeH        0
	Age        0.5

	Orbit
	{
		PeriodDays      1.139791423
		Eccentricity    0
		Inclination     28.08
		AscendingNode   207.93
		Epoch           2450127.04855
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "SIG2 CrB Ab"
{
	ParentBody "SIG CrB A"
	Class      ""
	MassSol    1.09
	RadSol     1.244
	Teff       5870
	Age        0.5

	Orbit
	{
		PeriodDays      1.139791423
		Eccentricity    0
		Inclination     28.08
		AscendingNode   207.93
		Epoch           2450127.04855
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// ---------------------------------------- //

Star "SIG CrB Ca"
{
	ParentBody "SIG CrB C"
	Class      "M2.5V"
	MassSol    0.423
	RadSol     0.437
	Teff       3454
	FeH        -0.06
	Age        2.95

	Orbit
	{
		Period          52
		Eccentricity    0.36
		Inclination     59
		AscendingNode   30
		Epoch           2438030.57204320
		ArgOfPericenter 307
		MeanAnomaly     0
	}
}

Star "SIG CrB Cb"
{
	ParentBody "SIG CrB C"
	Class      ""
	MassSol    0.1

	Orbit
	{
		Period          52
		Eccentricity    0.36
		Inclination     59
		AscendingNode   30
		Epoch           2438030.57204320
		ArgOfPericenter 127
		MeanAnomaly     0
	}
}

// 七公增一 - 七公增二(****)
Remove "17 Dra (AB)"{ParentBody "17 Dra"}
Remove "16 Dra"{ParentBody "17 Dra"}
Remove "17 Dra A"{ParentBody "17 Dra (AB)"}
Remove "17 Dra B"{ParentBody "17 Dra (AB)"}
// Ref: http://stars.astro.illinois.edu/sow/16-17dra.html
Barycenter "七公增一/17 Dra/Struve 2078/HIP 81292/SAO 30013/HD 150118/HR 6186"
{
	ParentBody "CCDM J16362+5255"
	Orbit
	{
		Period          38000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "17 Dra A"
{
	ParentBody "17 Dra"
	Class      "B9V"
	Teff       10500
	Luminosity 132
	RadSol     3.4
	RotationPeriod 19.2
	MassSol    3.1

	Orbit
	{
		Period          3800
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "17 Dra B"
{
	ParentBody "17 Dra"
	Class      "A1Vnn"
	Teff       9400
	Luminosity 40
	RadSol     2.4
	RotationPeriod 12
	MassSol    2.4

	Orbit
	{
		Period          3800
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "七公增二/16 Dra/HIP 81290/SAO 30012/HD 150100/HR 6184"
{
	ParentBody "CCDM J16362+5255"
	Orbit
	{
		Period          38000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "16 Dra A"
{
	ParentBody "16 Dra"
	Class      "B9.5V"
	Luminosity 112
	RadSol     3.2
	RotationPeriod 50.4
	MassSol    3
	Age        0.25

	Orbit
	{
		Period          5000 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "16 Dra B/Gaia EDR3 1425758000710501248"
{
	ParentBody "16 Dra"
	Class      "DA"
	Teff       30000
	MassSol    0.7

	Orbit
	{
		Period          5000 // ?
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 七公增五(*)
// 由于伴星未确认，这里先不启用伴星
// 如果要启用就把下面的代码取消注释，然后把Stars目录下的"七公"文件中的对应天体改为StarBarycenter
/*Star	"HD 133208 A"
{
	ParentBody     "HD 133208"
	Class          "G8IIIa"
	MassSol        3.4
	RadSol         21.5
	Luminosity     170
	Teff           4932
	FeH            -0.13
	RotationPeriod 4800
	Age            0.24

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0317501803
		Eccentricity    0
		Inclination     0.61044693
		AscendingNode   0
		ArgOfPericenter 134.923499
		MeanAnomaly     21.7288235
	}
}

Star	"HD 133208 B(?)"
{
	ParentBody     "HD 133208"
	Class          "M"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0317501803
		Eccentricity    0
		Inclination     0.61044693
		AscendingNode   0
		ArgOfPericenter 314.923499
		MeanAnomaly     21.7288235
	}
}*/

// 七公增七(SB*****)
Barycenter "ZET1 CrB/HR 5833/HD 139891"
{
	ParentBody "ZET CrB"
	Orbit
	{
		Separation      966
	}
}

Barycenter "ZET2 CrB/HR 5834/HD 139892"
{
	ParentBody "ZET CrB"
	Orbit
	{
		Separation      966
	}
}

// ---------------------------------------- //

Star	"ZET1 CrB A"
{
	ParentBody     "ZET1 CrB"
	Class          "B9V"
	MassSol        3.19

	Orbit
	{
		PeriodDays      9.5
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"ZET1 CrB B"
{
	ParentBody     "ZET1 CrB"
	Class          "A7.2 V"

	Orbit
	{
		PeriodDays      9.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// ---------------------------------------- //

Barycenter "ZET2 CrB AB"
{
	ParentBody "ZET2 CrB"
	Orbit
	{
		PeriodDays      251.5
		Eccentricity    0.48
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   28.5
	}
}

Star	"ZET2 CrB C"
{
	ParentBody     "ZET2 CrB"
	Class          ""
	MassSol        3.78

	Orbit
	{
		PeriodDays      251.5
		Eccentricity    0.48
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// ---------------------------------------- //

Star	"ZET2 CrB A"
{
	ParentBody     "ZET2 CrB AB"
	Class          "B6V"
	MassSol        4.13
	RotationPeriod 40.8

	Orbit
	{
		PeriodDays      1.72357
		Eccentricity    0.013
		Inclination     38
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   109.6
	}
}

Star	"ZET2 CrB B"
{
	ParentBody     "ZET2 CrB AB"
	Class          "B7V"
	MassSol        3.78

	Orbit
	{
		PeriodDays      1.72357
		Eccentricity    0.013
		Inclination     38
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   121.2
	}
}

// 七公增九(**)
Remove "NU2 Boo A"{ParentBody "NU2 Boo"}
Remove "NU2 Boo B"{ParentBody "NU2 Boo"}
Star "HD 138629 A"
{
	ParentBody "HD 138629"
	Class      "A5V"
	MassSol    2.84
	RadSol     6.21
	Luminosity 135
	Teff       7894
	Oblateness 0

	Orbit
	{
		Period          9
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 138629 B"
{
	ParentBody "HD 138629"
	Class      "A5V"

	Orbit
	{
		Period          9
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 七公增十三(*Pl2)
Remove "14 Her b"{ParentBody "14 Her"}
Remove "14 Her c"{ParentBody "14 Her"}
Planet	"HD 145675 b"
{
	ParentBody     "HD 145675"
	DiscMethod     "Astrometry" // Doppler spectroscopy
	DiscDate       "1998" // Naef et al., Switzerland, 1998.07.06
	Mass           2892.238258

	Orbit
	{
		SemiMajorAxis   2.845
		Eccentricity    0.3686
		Period          4.8277
		Inclination     32.7
		Epoch           2451372.7
		ArgOfPericenter 22.6
		MeanAnomaly     0
	}
}

Planet	"HD 145675 c"
{
	ParentBody     "HD 145675"
	DiscMethod     "Astrometry" // Doppler spectroscopy
	DiscDate       "2005" // Goździewski et al., USA, 2005.11.17
	Mass           2193.015822

	Orbit
	{
		SemiMajorAxis   27.4
		Eccentricity    0.64
		Period          144
		Inclination     101
		Epoch           2449100
		ArgOfPericenter 24.5
		MeanAnomaly     0
	}
}

// 七公增十四(AGB**)
Star "HD 148783 A"
{
	ParentBody "HD 148783"
	Class      "M6III"
	MassSol    1.65
	RadSol     69.71
	Luminosity 1408
	Teff       4235
	FeH        -0.01

	Orbit
	{
		PeriodDays      843.7
		Eccentricity    0.37
		Epoch           2451918.2
		ArgOfPericenter 66
		MeanAnomaly     0
		//SemiAmplitude   2.3
	}
}

Star "HD 148783 B"
{
	ParentBody "HD 148783"
	Class      "A9.8 V"

	Orbit
	{
		PeriodDays      843.7
		Eccentricity    0.37
		Epoch           2451918.2
		ArgOfPericenter 246
		MeanAnomaly     0
	}
}

// 七公增十五(**)
Star "HD 149630 A"
{
	ParentBody "HD 149630"
	Class      "B9V"
	MassSol    2.6
	DimensionsSol (9.82, 8.322, 9.82)
	Luminosity 230
	Teff       9794
	Age        0.404

	Orbit
	{
		PeriodDays      2706.19
		Eccentricity    0.5135
		Inclination     105.25
		AscendingNode   14.95
		Epoch           2450665.9
		ArgOfPericenter 4.97
		MeanAnomaly     0
	}
}

Star "HD 149630 B"
{
	ParentBody "HD 149630"
	Class      "A"
	MassSol    1.5
	Luminosity 7.4

	Orbit
	{
		PeriodDays      2706.19
		Eccentricity    0.5135
		Inclination     105.25
		AscendingNode   14.95
		Epoch           2450665.9
		ArgOfPericenter 184.97
		MeanAnomaly     0
	}
}

// 七公增十六(a2***)
Star "HD 152107 A"
{
	ParentBody "HD 152107"
	Class      "A1VpSiSrCr"
	MassSol    2.19
	RadSol     2.3
	Luminosity 29.5
	Teff       8840
	Age        0.525

	Orbit
	{
		Period          56.4
		SemiMajorAxis   5.31356179
		Eccentricity    0.13
		Inclination     37.4
		AscendingNode   57.5
		Epoch           2448330.40204883
		ArgOfPericenter 249.4
		MeanAnomaly     0
	}
}

Barycenter "HD 152107 B"
{
	ParentBody "HD 152107"
	Orbit
	{
		Period          56.4
		SemiMajorAxis   10.03163821
		Eccentricity    0.13
		Inclination     37.4
		AscendingNode   57.5
		Epoch           2448330.40204883
		ArgOfPericenter 69.4
		MeanAnomaly     0
	}
}

Star "HD 152107 Ba"
{
	ParentBody "HD 152107 B"
	Class      "K0V"
	MassSol    0.58

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0783796225
		Eccentricity    0.159236968
		Inclination     1.25093865
		AscendingNode   0
		ArgOfPericenter 171.518686
		MeanAnomaly     137.884361
	}
}

Star "HD 152107 Bb"
{
	ParentBody "HD 152107 B"
	Class      ""
	MassSol    0.58

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0783796225
		Eccentricity    0.159236968
		Inclination     1.25093865
		AscendingNode   0
		ArgOfPericenter 351.518686
		MeanAnomaly     137.884361
	}
}
