// Object * f Oph  ---  Star  ---  OID=@2699928   (@@53651,7)  ---  coobox=18078 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Barycenter "53 Oph A"
{
	ParentBody      "53 Oph"
	BinaryOrbit     
	{
		Epoch           2455563
		Separation      4758.72086021778 // 41.28 asec
		PositionAngle   190
	}
}

Star "53 Oph Aa"
{
	DateUpdated     "2024-05-17"
	ParentBody      "53 Oph A"
	Class           "A2V"
	AbsMagn         0.5 // 计算的值
	MassSol         2.50
	RadSol          1.7
	LumBol          56.4
	Teff            9311
	FeH             0.21

	BinaryOrbit     
	{
		Separation      42.562033785114 // 0.3692 asec
	}
}

Star "53 Oph Ab"
{
	ParentBody      "53 Oph A"
	Class           "A6?"
}

// Object BD+09 3423  ---  Star  ---  OID=@2699926   (@@53651,5)  ---  coobox=18078 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+09 3423/Gaia DR3 4490827635882165248/TIC 319175253/ADS 10635 B/AG+09 2072/CCDM J17346+0935B/CSI+09 3423 1/GC 23823/GEN# +1.00159480B/GEN# +0.00903423/GSC 00996-02303/IDS 17299+0939 B/PPM 164230/ROT 8/SAO 122525/SKY# 31728/TYC 996-2303-1/UBV 14966/UBV M 397/YZ 9 7908/2MASS J17343620+0934315/WDS J17346+0935B/** STF 4034B/Gaia DR1 4490827631584084224/Gaia DR2 4490827635882165248"
{
	DateUpdated     "2024-05-17"
	ParentBody      "53 Oph"
	Parallax        8.6998
	AppMagn         7.469
	Class           "A8IV"
	AbsMagn         2.17 // 计算的值
	RadSol          1.72
	LumBol          7.74
	Teff            7344
}
